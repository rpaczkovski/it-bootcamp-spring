package com.itbootcamp.praticaintegradora13.dto;

import com.itbootcamp.praticaintegradora13.entity.Personage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonageDTO {

    private String name;
    private Double height;
    private Double mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeworld;
    private String species;

    public PersonageDTO() {}

    public PersonageDTO convert(Personage personage) {
        this.name = personage.getName();
        this.height = personage.getHeight();
        this.mass = personage.getMass();
        this.birthYear = personage.getBirthYear();
        this.hairColor = personage.getHairColor();
        this.skinColor = personage.getSkinColor();
        this.eyeColor = personage.getEyeColor();
        this.gender = personage.getGender();
        this.homeworld = personage.getHomeworld();
        this.species = personage.getSpecies();

        return this;
    }

}
