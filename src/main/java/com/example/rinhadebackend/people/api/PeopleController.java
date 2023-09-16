package com.example.rinhadebackend.people.api;

import com.example.rinhadebackend.people.app.entities.Person;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PeopleController {

    @PostMapping("/pessoas")
    public void createPerson(){

    }

    @GetMapping("/pessoas/{id}")
    public Person getPersonById(@PathVariable Long id){
        return null;
    }
}
