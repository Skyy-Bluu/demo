package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDAO {
    //returns 1 or 0 depending on wether person was added or not
    int insertAPerson(UUID id, Person person);  //Assumes ID given

    //adds person by generating UUID first and then using inesrtAPerson method
    default int insertAPerson(Person person){ // Assumes ID was not givem
        UUID id = UUID.randomUUID();
        return insertAPerson(id, person);
    }

       

}