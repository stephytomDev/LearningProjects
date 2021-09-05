package com.stom.petclinic.services;

import java.util.List;

import com.stom.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findOwnerByLastName(String lastName);
	
    List<Owner> findAllByLastNameLike(String lastName);

}
