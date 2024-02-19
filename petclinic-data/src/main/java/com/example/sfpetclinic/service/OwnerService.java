package com.example.sfpetclinic.service;

import com.example.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
