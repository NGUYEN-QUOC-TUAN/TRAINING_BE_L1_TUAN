package com.example.tranding_l1_tuan_2003.service.impl;

import com.example.tranding_l1_tuan_2003.model.Employee;
import com.example.tranding_l1_tuan_2003.repository.EmployeeRepository;
import com.example.tranding_l1_tuan_2003.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getListEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee searchEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        if(!employeeRepository.existsById(id)) {
            System.out.println("KHÔNG CÓ EMPLOYEE ĐỂ UPDATE");
            return null;
        }
        return employeeRepository.save(employee);
    }
}
