package com.SpringAlphaProject.AlphaProject.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringAlphaProject.AlphaProject.Entity.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory sf;

	public List<Employee> getEmpData() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		List<Employee> emp = cr.list();
		return emp;
	}

	public String insertEmpData(List<Employee> li) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Employee employee : li) {
			session.save(employee);
		}
		tr.commit();
		return "Data Insert Successfully...!!!!!";
	}

	public String updateEmpData(Employee e) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(e);
		tr.commit();
		return "Data Update Successfully....!!!!!!";
	}

	public String deleteEmpData(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = session.load(Employee.class, id);
		session.delete(emp);
		tr.commit();
		return "Delete Data Successfully.....!!!!!";
	}

	public List<Employee> getGTEmpData(double salary) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("salary", salary));
		List<Employee> emp = cr.list();
		return emp;
	}

	public List<Employee> getGTEEmpData(double salary) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.ge("salary", salary));
		List<Employee> emp = cr.list();
		return emp;
	}

	public List<Employee> getLTEmpData(double salary) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.lt("salary", salary));
		List<Employee> emp = cr.list();
		return emp;
	}

	public List<Employee> getLTEEmpData(double salary) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.le("salary", salary));
		List<Employee> emp = cr.list();
		return emp;
	}

	public List<Employee> getEmpInBetweenData(double salary, double salary1) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.between("salary", salary, salary1));
		List<Employee> emp = cr.list();
		return emp;
	}

	public List<Employee> getEmpDataWithDesignation(String designation) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.eq("designation", designation));
		List<Employee> emp = cr.list();
		return emp;
	}

}
