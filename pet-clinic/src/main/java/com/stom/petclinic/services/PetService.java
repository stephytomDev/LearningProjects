package com.stom.petclinic.services;

import java.util.Set;

import com.stom.petclinic.model.Pet;

public interface PetService {
	
    Pet findById(long id);
	
    Pet Save(Pet pet);
	
	Set<Pet> findAll();

}
