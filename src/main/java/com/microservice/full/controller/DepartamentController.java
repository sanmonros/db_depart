package com.microservice.full.controller;

import com.microservice.full.entity.Departament;
import com.microservice.full.service.DepartamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/departaments")
@RequiredArgsConstructor
public class DepartamentController {

    private final DepartamentService departamentService;

    @PostMapping
    public Departament createDepartament(@RequestBody Departament departament){
        return departamentService.createDepartament(departament);
    }
    @GetMapping("/{id}")
    public Departament getDepartamentById(@PathVariable Long id){
        return departamentService.getDepartamentById(id);
    }

    @GetMapping
    public List<Departament> findAll(){
        return departamentService.findAll();
    }
}
