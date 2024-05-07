package com.microservice.full.service;

import com.microservice.full.entity.Departament;
import com.microservice.full.repository.DepartamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartamentService {

    @Autowired
    private final DepartamentRepository departamentRepository;

    public Departament createDepartament(Departament departament){
        return departamentRepository.save(departament);
    }

    public Departament getDepartamentById(Long id){
        return departamentRepository.findById(id).get();
    }

    public List<Departament> findAll(){
        return departamentRepository.findAll();
    }

}
