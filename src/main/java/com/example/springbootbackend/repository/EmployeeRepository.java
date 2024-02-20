package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository exposes database code methods like save, find by id or delete by id, It exposes a lot of methods

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
