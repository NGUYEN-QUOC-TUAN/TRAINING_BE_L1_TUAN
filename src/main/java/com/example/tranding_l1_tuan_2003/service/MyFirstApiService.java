package com.example.tranding_l1_tuan_2003.service;

import com.example.tranding_l1_tuan_2003.model.People;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyFirstApiService {
    String hello(String name);

    List<People> getPeople();

    People createPerson(People people);

    void deletePerson(String id);

    People searchPerson(String id);
}
