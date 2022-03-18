package br.com.itbootcamp.praticaintegradora11.services;

import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class MyService {

    public Integer execute(Integer day, Integer month, Integer year) {

        Calendar today = Calendar.getInstance();
        Calendar birthDate =  Calendar.getInstance();
        birthDate.set(year, month, day);

        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if(today.get(Calendar.DAY_OF_YEAR) > birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

       return Integer.valueOf(age);
    }
}
