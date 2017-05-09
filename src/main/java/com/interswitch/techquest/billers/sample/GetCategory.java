package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.billers.dto.Category;
import com.interswitch.techquest.billers.dto.CategoryResponse;

public class GetCategory extends BaseSample {

    public static void main(String[] args) {

        try {

            CategoryResponse response = billPayment.getCategorys();
            if (response instanceof CategoryResponse) {

                Category[] categories = response.getCategorys();

                Category aCategory = categories[0];

                String categoryId = aCategory.getCategoryid();
                String categoryName = aCategory.getCategoryname();
                String categoryDesc = aCategory.getCategorydescription();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
