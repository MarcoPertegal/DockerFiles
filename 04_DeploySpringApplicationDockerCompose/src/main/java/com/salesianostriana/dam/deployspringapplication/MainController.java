package com.salesianostriana.dam.deployspringapplication;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/")
    public String holaMundo(){
        return "hola mundo";
    }
}
