package com.itbootcamp.projetointegrador9.controllers;

import com.itbootcamp.projetointegrador9.services.ConversionService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RomanNumberController {


    @GetMapping("conversion")
    @ResponseBody
    public String conversion(@RequestParam Integer number) {
        return ConversionService.toRoman(number);
    }
}
