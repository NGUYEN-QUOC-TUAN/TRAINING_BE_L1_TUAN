package com.example.tranding_l1_tuan_2003.controller;

import com.example.tranding_l1_tuan_2003.model.Employee;
import com.example.tranding_l1_tuan_2003.repository.EmployeeRepository;
import com.example.tranding_l1_tuan_2003.service.MyFirstApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class MyFirstApiController {
    @Autowired
    private MyFirstApiService myFirstApiService;
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping
    public ResponseEntity<String> hello() {
        String yourName = myFirstApiService.hello("Quốc Tuấn");
        return ResponseEntity.ok(yourName);
    }
    @GetMapping("/list")
    public ResponseEntity<List<Employee>> getAllListEmployee() {
        List<Employee> listEmployees = employeeRepository.findAll();
        System.out.println(listEmployees.toString());
        return ResponseEntity.ok(listEmployees);
    }
}
