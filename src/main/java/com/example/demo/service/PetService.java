package com.example.demo.service;

import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService implements IPetService {
    @Autowired
    private PetRepository repository;

    @Override
    public List<Pet> findAll() {
        List<Pet> pets = (List<Pet>) repository.findAll();
        return pets;
    }
}
