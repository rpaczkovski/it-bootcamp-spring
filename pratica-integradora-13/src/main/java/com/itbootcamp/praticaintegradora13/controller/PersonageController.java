package com.itbootcamp.praticaintegradora13.controller;

import com.itbootcamp.praticaintegradora13.dto.PersonageDTO;
import com.itbootcamp.praticaintegradora13.entity.Personage;
import com.itbootcamp.praticaintegradora13.service.PersonageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonageController {

    @Autowired
    private PersonageService personageService;

    @GetMapping("/starwars")
    public ResponseEntity<PersonageDTO> findByName(@RequestParam String name) {
        Personage personage = personageService.findByName(name);
        PersonageDTO personageDTO = new PersonageDTO().convert(personage);

        return ResponseEntity.ok().body(personageDTO);
    }

}
