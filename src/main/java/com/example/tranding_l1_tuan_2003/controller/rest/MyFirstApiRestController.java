package com.example.tranding_l1_tuan_2003.controller.rest;

import com.example.tranding_l1_tuan_2003.model.People;
import com.example.tranding_l1_tuan_2003.service.MyFirstApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello-rest")
public class MyFirstApiRestController {
    @Autowired
    private MyFirstApiService myFirstApiService;

    @GetMapping("/your-name")
    public ResponseEntity<String> helloRest() {
        String yourName = myFirstApiService.hello("Quốc Tuấn");
        return ResponseEntity.ok(yourName);
    }

    @GetMapping
    public ResponseEntity<List<People>> getPersons() {
        return ResponseEntity.ok(myFirstApiService.getPeople());
    }

    @PostMapping
    public ResponseEntity<List<People>> createPerson(@RequestBody People people) {
        myFirstApiService.createPerson(people);
        return ResponseEntity.ok(myFirstApiService.getPeople());
    }

    @PostMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable("id") String id) {
        myFirstApiService.deletePerson(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<People> search(@PathVariable("id") String id) {
        People people = myFirstApiService.searchPerson(id);
        return ResponseEntity.ok(people);
    }


}
