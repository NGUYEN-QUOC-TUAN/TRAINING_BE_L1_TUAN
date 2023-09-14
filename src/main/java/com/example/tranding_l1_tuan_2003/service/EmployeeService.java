package com.example.tranding_l1_tuan_2003.service;

import com.example.tranding_l1_tuan_2003.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> getListEmployees();
    Employee createEmployee(Employee employee);
    void deleteEmployee(Integer id);
    Employee searchEmployee(Integer id);
    Employee updateEmployee(Integer id, Employee employee);
}
