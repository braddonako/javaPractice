package com.example.demo.dao;

import java.util.UUID;

//The functionality of this API is to hide from the application all the complexities involved 
// in performing CRUD operations in the underlying storage mechanism.
// This permits both layers to evolve separately without knowing anything about each other.

public interface PersonDao {
    // this is the contract for anyone that wants to use this interface

    int insertPerson(UUID id, Person person);
    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }


}
