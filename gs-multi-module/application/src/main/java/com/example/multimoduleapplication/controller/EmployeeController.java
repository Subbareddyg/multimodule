package com.example.multimoduleapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimoduleapplication.model.Employee;

@RestController
@Service
public class EmployeeController {
	private static final Logger LOGGER = LogManager.getLogger(EmployeeController.class);

	@RequestMapping("/")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		try {

			employeesList.add(new Employee(1, "venkat", "reddy", "howtodoinjava@gmail.com"));

		} catch (Exception exception) {
			LOGGER.error("Error occurred in business service : {}", exception.getMessage());
		}
		return employeesList;
	}

}
