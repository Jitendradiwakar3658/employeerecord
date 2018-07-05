package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.domain.Employee;
import com.employee.reporitories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public String addEmployee(Employee employee) {
		Employee emp = repository.save(employee);
		if(emp!=null) {
			return "Added succesfully!!!";
		}else {
			return "Failed to add!!!";
		}
	}

	public String updateEmployee(Employee employee) {
		Employee emp = repository.save(employee);
		if(emp!=null) {
			return "Updated succesfully!!!";
		}else {
			return "Failed to add!!!";
		}
	}

	public List<Employee> findAllEmployee() {
		return repository.findAll();
	}

	public void removeEmployeeById(Integer id) {
		 repository.deleteById(id);
	}

	public Employee findEmployeeById(Integer id) {
		return repository.findEmployeeById(id);
	}

}
