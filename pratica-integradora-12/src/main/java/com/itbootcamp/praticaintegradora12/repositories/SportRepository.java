package com.itbootcamp.praticaintegradora12.repositories;

import com.itbootcamp.praticaintegradora12.entities.Sport;
import com.itbootcamp.praticaintegradora12.repositories.interfaces.ISportRepository;

public class SportRepository implements ISportRepository<Integer, Sport> {
    @Override
    public Object findById(Number id) {
        return null;
    }

    @Override
    public Object findAll() {
        return null;
    }

    @Override
    public void insert() {

    }

    @Override
    public Sport findBySport(String sport, String Name) {
        return null;
    }
}
