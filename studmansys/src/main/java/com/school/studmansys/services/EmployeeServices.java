package com.school.studmansys.services;

import java.util.List;

import com.school.studmansys.employee.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getById(Long id);
	void deleteViaId(long id);
}
