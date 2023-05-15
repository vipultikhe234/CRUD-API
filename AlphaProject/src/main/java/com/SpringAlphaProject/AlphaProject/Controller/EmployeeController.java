package com.SpringAlphaProject.AlphaProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAlphaProject.AlphaProject.Entity.Employee;
import com.SpringAlphaProject.AlphaProject.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	// api 1
	@GetMapping("/getallEmpData")
	public List<Employee> getEmpData() {
		return service.getEmpData();
	}

	// api 2
	@PostMapping("/insertEmpData")
	public String insertEmpData(@RequestBody List<Employee> li) {
		return service.insertEmpData(li);
	}

	// api 3
	@PutMapping("/updateEmpData")
	public String updateEmpData(@RequestBody Employee e) {
		return service.updateEmpData(e);
	}

	// api 4
	@GetMapping("deleteEmpData/{id}")
	public String deleteEmpData(@PathVariable int id) {
		return service.deleteEmpData(id);
	}

	// api 5
	@GetMapping("/getGTEmpData/{salary}")
	public List<Employee> getGTEmpData(@PathVariable double salary) {
		return service.getGTEmpData(salary);
	}

	// api 6
	@GetMapping("/getGTEEmpData/{salary}")
	public List<Employee> getGTEEmpData(@PathVariable double salary) {
		return service.getGTEEmpData(salary);
	}

	// api 7
	@GetMapping("getLTEmpData/{salary}")
	public List<Employee> getLTEmpData(@PathVariable double salary) {
		return service.getLTEmpData(salary);
	}

	// api 8
	@GetMapping("/getLTEEmpData/{salary}")
	public List<Employee> getLTEEmpData(@PathVariable double salary) {
		return service.getLTEEmpData(salary);
	}

	// api 9
	@GetMapping("/getEmpInBetweenData/{salary}/{salary1}")
	public List<Employee> getEmpInBetweenData(@PathVariable double salary, @PathVariable double salary1) {
		return service.getEmpInBetweenData(salary, salary1);
	}

	// api 10
	@GetMapping("/getEmpDataWithDesignation/{designation}")
	public List<Employee> getEmpDataWithDesignation(@PathVariable String designation) {
		return service.getEmpDataWithDesignation(designation);
	}

}
