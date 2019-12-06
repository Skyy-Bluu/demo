package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.demo.model.Person;

public class FakePersonDataAccessService implements PersonDAO {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertAPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 0;
    }
}