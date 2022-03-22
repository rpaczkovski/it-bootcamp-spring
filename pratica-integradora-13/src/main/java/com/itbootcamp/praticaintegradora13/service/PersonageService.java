package com.itbootcamp.praticaintegradora13.service;

import com.itbootcamp.praticaintegradora13.entity.Personage;
import com.itbootcamp.praticaintegradora13.repository.PersonageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonageService {

    @Autowired
    private PersonageRepository personageRepository;

    public Personage findByName(String name) {
         Personage personage = personageRepository.findByName(name);
         return personage;
    }



}
