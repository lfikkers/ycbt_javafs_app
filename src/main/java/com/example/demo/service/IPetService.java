package com.example.demo.service;

import com.example.demo.model.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> findAll();
}
