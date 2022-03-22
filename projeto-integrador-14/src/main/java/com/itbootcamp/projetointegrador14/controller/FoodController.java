package com.itbootcamp.projetointegrador14.controller;

import com.itbootcamp.projetointegrador14.dto.FoodRequestDTO;
import com.itbootcamp.projetointegrador14.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping("/caculate")
    public ResponseEntity<String> calculateCalories(@RequestBody(required = false) FoodRequestDTO ingredients) {
        String result = foodService.calculateCalories(ingredients);
        return ResponseEntity.ok().body(result);
    }
}
