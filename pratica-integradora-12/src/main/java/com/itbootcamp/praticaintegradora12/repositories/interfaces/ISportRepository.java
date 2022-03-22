package com.itbootcamp.praticaintegradora12.repositories.interfaces;

public interface ISportRepository<U extends Number, T> extends IRepository{
    T findBySport(String sport, String Name);
}
