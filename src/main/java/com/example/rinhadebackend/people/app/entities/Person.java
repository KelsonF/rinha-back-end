package com.example.rinhadebackend.people.app.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;

    @Size(max = 32)
    String nickName;

    @Size(max = 100)
    String name;

    Date birthday;

    @ElementCollection
    List<String> stackList;
}
