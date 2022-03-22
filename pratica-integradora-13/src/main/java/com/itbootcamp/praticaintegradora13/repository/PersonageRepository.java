package com.itbootcamp.praticaintegradora13.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.itbootcamp.praticaintegradora13.entity.Personage;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.lang.reflect.Type;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@Repository
public class PersonageRepository {

    private static final Type PERSONAGE_TYPE = new TypeToken<List<Personage>>() {
    }.getType();

    private List<Personage> personageList;

    public PersonageRepository() {
        loading();
    }

    public Personage findByName(String name) {
        Iterator<Personage> iter = personageList.iterator();
        while (iter.hasNext()) {
            Personage personage = iter.next();
            if (personage.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                return personage;
            }
        }
        return null;
    }

    private void loading() {
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader("src/main/resources/starwars.json"));
            this.personageList = gson.fromJson(reader, PERSONAGE_TYPE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
