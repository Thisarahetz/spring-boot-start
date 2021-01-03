package com.example.demo.deo;

import com.example.demo.Model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person)
}
