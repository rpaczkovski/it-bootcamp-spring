package com.itbootcamp.projetointegrador14.service;

import com.itbootcamp.projetointegrador14.dto.FoodRequestDTO;
import com.itbootcamp.projetointegrador14.entity.Food;
import com.itbootcamp.projetointegrador14.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public String calculateCalories(FoodRequestDTO foodRequestDTO) {

        Double calories = 0.0;
        String higherCalorieFood = "";
        Double highestCalorie = 0.0;

        for (String ingredient : foodRequestDTO.getIngredients()) {
            Optional<Food> foundFood = foodRepository.findByName(ingredient);

            if (foundFood == null) {
                continue;
            }

            if (Double.compare(foundFood.get().getCalories(), highestCalorie) > 0) {
                higherCalorieFood = foundFood.get().getName();
                highestCalorie = foundFood.get().getCalories();
            }

            calories += foundFood.get().getCalories();
        }

        if(calories > 0.0) {
            return "O total de calorias do prato eh " + calories + " o ingrediente mais calorico eh " + higherCalorieFood
                    + " com " + highestCalorie + " calorias.";
        } else  {
            return "Nenhum dos ingredientes encontrada nos dados do restaurante.";
        }
    }


}
