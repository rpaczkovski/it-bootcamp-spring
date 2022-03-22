package com.itbootcamp.praticaintegradora12.services;

import com.itbootcamp.praticaintegradora12.dtos.PeopleRequestDTO;
import com.itbootcamp.praticaintegradora12.dtos.PeopleResponseDTO;
import com.itbootcamp.praticaintegradora12.entities.People;
import com.itbootcamp.praticaintegradora12.entities.Sport;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class PeopleService {




    public boolean create(PeopleRequestDTO dto) {
        People people = new PeopleRequestDTO().convert(dto);
        peopleList.put(globalId++, people);
        return true;
    }

    public PeopleResponseDTO getPeople(Integer id) {
        PeopleResponseDTO peopleResponseDTO = new PeopleResponseDTO();
        return peopleResponseDTO.convert(peopleList.get(id));
    }

    public List<PeopleResponseDTO> getPeoples() {

        return peopleList.values().stream().map(p -> new PeopleResponseDTO().convert(p)).collect(Collectors.toList());
    }


    public List<PeopleResponseDTO> getPeopleBySport(String name, String level) {
        return peopleList.values().stream().filter(p -> {
                    if (name != null && level != null) {
                        return name.equalsIgnoreCase(p.getSport().getName())
                                && level.equalsIgnoreCase(p.getSport().getLevel());
                    } else if(name != null && level == null) {
                        return name.equalsIgnoreCase(p.getSport().getName());
                    } else if(level != null & name == null) {
                            return level.equalsIgnoreCase(p.getSport().getLevel());
                    }
                    return false;
                }
        ).map(p -> new PeopleResponseDTO().convert(p)).collect(Collectors.toList());
    }

}
