package com.example.tranding_l1_tuan_2003.repository;

import com.example.tranding_l1_tuan_2003.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
