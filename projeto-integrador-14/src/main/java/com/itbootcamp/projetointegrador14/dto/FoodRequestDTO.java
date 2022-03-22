package com.itbootcamp.projetointegrador14.dto;

import java.util.ArrayList;
import java.util.List;

public class FoodRequestDTO {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }
}
