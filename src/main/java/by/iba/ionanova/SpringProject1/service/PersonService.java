package by.iba.ionanova.SpringProject1.service;

import by.iba.ionanova.SpringProject1.entity.Person;
import by.iba.ionanova.SpringProject1.exceptions.ResourceNotFoundException;

import java.util.List;

public interface PersonService {
    List<Person> getAllPerson();
    void addNewPerson(Person person);
    void deletePerson(Person person );
    void editPerson(Person person, Long id);
    Person getById(long id) throws ResourceNotFoundException;
}