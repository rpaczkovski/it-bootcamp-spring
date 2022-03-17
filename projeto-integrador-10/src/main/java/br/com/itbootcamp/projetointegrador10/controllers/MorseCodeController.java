package br.com.itbootcamp.projetointegrador10.controllers;

import br.com.itbootcamp.projetointegrador10.services.ConversionToCodeMorseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MorseCodeController {

    @GetMapping("/conversion")
    public ResponseEntity<?> conversion(@RequestBody String text) {
        return ResponseEntity.ok(ConversionToCodeMorseService.execute(text));
    }

}
