package com.itbootcamp.praticaintegradora12.repositories;

import com.itbootcamp.praticaintegradora12.entities.People;
import com.itbootcamp.praticaintegradora12.entities.Sport;
import com.itbootcamp.praticaintegradora12.repositories.interfaces.IRepository;

import java.util.HashMap;
import java.util.Map;

public class PeopleRepository implements IRepository<Integer, People> {

    private final static Map<Integer, People> peopleList = new HashMap<>();
    private Integer globalId = 3;

    static {
        peopleList.put(1, new People(
                "Rodrigo",
                "Paczkovski",
                18,
                new Sport("Atletismo", "Amador")));
        peopleList.put(2, new People(
                "Anna",
                "Santos",
                18,
                new Sport("Natacao", "Semi-profissional")));
    }

    @Override
    public People findById(Integer id) {
        return null;
    }

    @Override
    public People findAll() {
        return null;
    }

    @Override
    public void insert() {

    }
}
