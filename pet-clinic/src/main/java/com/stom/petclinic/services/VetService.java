package com.stom.petclinic.services;

import java.util.Set;

import com.stom.petclinic.model.Vet;

public interface VetService {
	
    Vet findById(long id);
	
    Vet Save(Vet vet);
	
	Set<Vet> findAll();

}
