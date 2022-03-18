package br.com.itbootcamp.praticaintegradora11.controllers;

import br.com.itbootcamp.praticaintegradora11.services.MyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class MyController {

    private final MyService service;

    @GetMapping("{day}/{month}/{year}")
    public ResponseEntity<?> getPeople(
            @PathVariable Integer day,
            @PathVariable Integer month,
            @PathVariable Integer year) {

        System.out.println("chegou aqui");
       return ResponseEntity.ok(service.execute(day, month, year));
    }

}
