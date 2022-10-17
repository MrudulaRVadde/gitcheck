package com.example.EmployeeManagementSystem.Controller;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagementSystem.Entity.*;

	@RestController
	@CrossOrigin(origins="*")
	public class Controller {

		@GetMapping("Employees")
		public List<Employee> getEmployeeDetails(){
			
			return Stream.of(new Employee(1, "ABC", "M", "abc1@gmail.com", 1234, 20000.0),
					new Employee(2, "BC", "F", "bcd@gmail.com", 2345, 22000.0),
					new Employee(4, "CDE", "M", "cde@gmail.com", 3456, 24000.0)).collect(Collectors.toList());
			
	}
}

