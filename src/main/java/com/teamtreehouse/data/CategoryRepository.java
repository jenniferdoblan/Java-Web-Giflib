package com.teamtreehouse.data;
import com.teamtreehouse.Controller.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(

            new Category(1,"Movies"),
            new Category(2,"People"),
            new Category(3, "Animals")
    );
    public List<Category> getAllCategories(){

        return ALL_CATEGORIES;

        }

    public Category findById(int id) {
        for (Category cat : ALL_CATEGORIES) {
            if (cat.getId()==id) {
                return cat;
            }

        }
            return null;
    }

}

