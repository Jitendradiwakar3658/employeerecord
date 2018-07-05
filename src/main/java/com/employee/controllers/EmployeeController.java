package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.domain.Employee;
import com.employee.services.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/v1/add/employee", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}

	@RequestMapping(value = "/v1/update/employee", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String upadteEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@RequestMapping(value = "/v1/findAll/employee", method = RequestMethod.GET)
	public List<Employee> findAllEmployee() {
		return service.findAllEmployee();
	}

	@RequestMapping(value = "/v1/find/employee", method = RequestMethod.GET)
	public Employee findEmployeeById(@RequestParam Integer id) {
		return service.findEmployeeById(id);
	}

	@RequestMapping(value = "/v1/remove/employee", method = RequestMethod.DELETE)
	public void removeEmployeeById(@RequestParam Integer id) {
		service.removeEmployeeById(id);
	}
}
