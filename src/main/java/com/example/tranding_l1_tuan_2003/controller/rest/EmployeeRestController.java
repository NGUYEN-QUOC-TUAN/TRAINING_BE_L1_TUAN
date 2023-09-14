package com.example.tranding_l1_tuan_2003.controller.rest;

import com.example.tranding_l1_tuan_2003.model.Employee;
import com.example.tranding_l1_tuan_2003.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("/*")
@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getListEmployees() {
        return ResponseEntity.ok(employeeService.getListEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> searchEmployees(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(employeeService.searchEmployee(id));
    }

    @PostMapping
    public ResponseEntity<List<Employee>> createEmployye(@RequestBody Employee employee) {
        Employee employeeCreate = employeeService.createEmployee(employee);
        System.out.println(employeeCreate);
        return ResponseEntity.ok(employeeService.getListEmployees());
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Employee>> updateEmployye(@PathVariable(name = "id") Integer id, @RequestBody Employee employee) {
        Employee employeeCreate = employeeService.updateEmployee(id, employee);
        System.out.println(employeeCreate);
        return ResponseEntity.ok(employeeService.getListEmployees());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployees(@PathVariable(name = "id") Integer id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
}
