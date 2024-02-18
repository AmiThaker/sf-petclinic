package com.example.sfpetclinic.service;

import com.example.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);

    Set<Vet> findAll();
}
