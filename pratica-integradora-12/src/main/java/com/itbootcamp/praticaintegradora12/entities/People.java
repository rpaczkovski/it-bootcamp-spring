package com.itbootcamp.praticaintegradora12.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class People {

    private String name;
    private String surname;
    private Integer age;
    private Sport sport;

}
