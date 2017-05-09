package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.billers.dto.Biller;
import com.interswitch.techquest.billers.dto.BillerResponse;
import com.interswitch.techquest.billers.dto.Category;
import com.interswitch.techquest.billers.dto.CategoryResponse;

public class GetBillersInCategory extends BaseSample {

    public static void main(String[] args) {

        try {

            // get a category
            CategoryResponse response = billPayment.getCategorys();

            if (response instanceof CategoryResponse) {

                Category aCategory = (response.getCategorys()!=null && response.getCategorys().length > 0) ? response.getCategorys()[0] : null;

                if(aCategory == null) { // if there is no category, break here.
                    throw new Exception("Category Array is empty");
                }
                String id = aCategory.getCategoryid();

                // get all the billers under this categoryId

                BillerResponse billersResponse = billPayment.getCategoryBillers(id);

                if (billersResponse instanceof BillerResponse) {
                    Biller[] billerArray = billersResponse.getBiller();

                    Biller firstBiller = billerArray[0];

                    String billerId = firstBiller.getBillerid();

                    String billername = firstBiller.getBillername();

                    System.out.println("biller id is: " + billerId);
                    System.out.println("biller name is " + billername);
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
