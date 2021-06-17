package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmpRepo empRepo;


    @GetMapping("/")
    public String welcome(){
        return "Welcome User New commit jenkins 6";
    }

    @GetMapping("/put/{name}")
    public String welcomeName(@PathVariable String name){
        Employee e =  new Employee();
        Date d = new Date();
        e.setEmpName(name);
        e.setDoj(d.getTime());
        System.out.println(e);
        empRepo.save(e);
        return "Welcome "+name;
    }

    @GetMapping("/all")
    public Iterable<Employee> welcomeAll(){
        Iterable i = empRepo.findAllByIdAsc();
        return  i ;
    }
}
