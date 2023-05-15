package com.SpringAlphaProject.AlphaProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAlphaProject.AlphaProject.Dao.EmployeeDao;
import com.SpringAlphaProject.AlphaProject.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	public List<Employee> getEmpData() {
		return dao.getEmpData();
	}

	public String insertEmpData(List<Employee> li) {
		return dao.insertEmpData(li);
	}

	public String updateEmpData(Employee e) {
		return dao.updateEmpData(e);
	}

	public String deleteEmpData(int id) {
		return dao.deleteEmpData(id);
	}

	public List<Employee> getGTEmpData(double salary) {
		return dao.getGTEmpData(salary);
	}

	public List<Employee> getGTEEmpData(double salary) {
		return dao.getGTEEmpData(salary);
	}

	public List<Employee> getLTEmpData(double salary) {
		return dao.getLTEmpData(salary);
	}

	public List<Employee> getLTEEmpData(double salary) {
		return dao.getLTEEmpData(salary);
	}

	public List<Employee> getEmpInBetweenData(double salary, double salary1) {
		return dao.getEmpInBetweenData(salary, salary1);
	}

	public List<Employee> getEmpDataWithDesignation(String designation) {
		return dao.getEmpDataWithDesignation(designation);
	}
}
