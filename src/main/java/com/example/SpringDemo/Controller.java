package com.example.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome(){
        return "Welcome User New commit";
    }

    @GetMapping("/{name}")
    public String welcomeName(@PathVariable String name){
        return "Welcome "+name;
    }
}
