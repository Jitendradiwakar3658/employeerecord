package com.employee.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Employee findEmployeeById(Integer id) ;
}
