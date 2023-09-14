package com.example.tranding_l1_tuan_2003.service.impl;

import com.example.tranding_l1_tuan_2003.model.People;
import com.example.tranding_l1_tuan_2003.service.MyFirstApiService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyFirstApiServiceImpl implements MyFirstApiService {
    private static final List<People> listPeople = new ArrayList<>();

    static {
        listPeople.add(new People("001", "Quốc Tuấn", 14));
        listPeople.add(new People("002", "Văn Lượng", 9));
        listPeople.add(new People("003", "Hoàng Tiến", 1));
    }

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public List<People> getPeople() {
        return listPeople;
    }

    @Override
    public People createPerson(People people) {
        listPeople.add(people);
        return people;
    }

    @Override
    public void deletePerson(String id) {
        listPeople.removeIf(p -> p.getCode().equals(id));
    }

    @Override
    public People searchPerson(String id) {
        System.out.println("HOÀNG TUẤN");
        return listPeople.stream().filter(p -> p.getCode().equals(id)).findFirst().orElse(null);
    }

}
