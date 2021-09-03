package com.stom.petclinic.services;

import java.util.Set;

import com.stom.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findOwnerByLastName(String lastName);
	
	Owner findById(long id);
	
	Owner Save(Owner owner);
	
	Set<Owner> findAll();

}
