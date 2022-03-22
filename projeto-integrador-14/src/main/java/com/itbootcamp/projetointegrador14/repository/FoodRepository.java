package com.itbootcamp.projetointegrador14.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.itbootcamp.projetointegrador14.entity.Food;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

@Repository
public class FoodRepository {

    private static final Type FOOD_TYPE = new TypeToken<List<Food>>() {
    }.getType();
    private List<Food> foodList;

    public FoodRepository() {
        loading();
    }

    public Optional<Food> findByName(String name) {
        Iterator<Food> iter = foodList.iterator();
        while (iter.hasNext()) {
            Food food = iter.next();
            if (food.getName().toLowerCase(Locale.ROOT).equalsIgnoreCase(name.toLowerCase(Locale.ROOT))) {
                return Optional.of(food);
            }
        }
        return null;
    }

    private void loading() {
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader("src/main/resources/food.json"));
            this.foodList = gson.fromJson(reader, FOOD_TYPE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
