package com.cognizant.jpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.jpahibernate.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
