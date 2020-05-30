package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/v1/person")
@RestController //this is a rest controller class -- we can now make endpoints that the client can consume
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // we are going to make a GET request for this
    @PostMapping // this is all you have to do to make a post request
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
}
