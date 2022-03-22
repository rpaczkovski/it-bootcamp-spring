package com.itbootcamp.praticaintegradora12.dtos;

import com.itbootcamp.praticaintegradora12.entities.People;
import com.itbootcamp.praticaintegradora12.entities.Sport;

public class PeopleResponseDTO {

    private String name;
    private String surname;
    private SportResponseDTO sport;

    public PeopleResponseDTO convert(People people) {
        this.name = people.getName();
        this.surname = people.getSurname();
        this.sport = new SportResponseDTO(people.getSport().getName());
        return this;
    }

}
