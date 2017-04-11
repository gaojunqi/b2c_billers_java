package sample;

import com.interswitch.billers.BillPayment;
import com.interswitch.billers.dto.Category;
import com.interswitch.billers.dto.CategoryResponse;
import com.interswitch.techquest.auth.Interswitch;

public class GetCategory extends BaseSample {
    
    public static void main(String[] args){
        
      //:compulsory
        BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);
        
        try{
            
            CategoryResponse response = billPayment.getCategorys();
            if(response instanceof CategoryResponse) {
                
                Category[] categories = response.getCategorys();
                
                Category aCategory = categories[0];
                
                String categoryId = aCategory.getCategoryid();
                String categoryName = aCategory.getCategoryname();
                String categoryDesc = aCategory.getCategorydescription();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
