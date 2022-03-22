package com.itbootcamp.praticaintegradora12.repositories.interfaces;

public interface IRepository<U extends Number, T> {
    T findById(U id);
    T findAll();
    void insert();
}
