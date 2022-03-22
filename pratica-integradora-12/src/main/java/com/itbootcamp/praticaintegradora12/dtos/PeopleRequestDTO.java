package com.itbootcamp.praticaintegradora12.dtos;

import com.itbootcamp.praticaintegradora12.entities.People;
import com.itbootcamp.praticaintegradora12.entities.Sport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PeopleRequestDTO {

    private String name;
    private String surname;
    private Integer age;
    private Sport sport;

    public PeopleRequestDTO convert(People people) {
        this.name = people.getName();
        this.surname = people.getSurname();
        this.sport = people.getSport();
        return this;
    }


    public  People convert(PeopleRequestDTO peopleRequestDTO) {
        return  new People(peopleRequestDTO.getName(), peopleRequestDTO.surname, peopleRequestDTO.getAge(), peopleRequestDTO.getSport());
    }

}
