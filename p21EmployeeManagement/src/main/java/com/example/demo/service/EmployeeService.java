package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	void addEmployeeInDb(Employee employee );
	void deleteEmployee(int eId);
	void deleteAllEmployee();
	Employee getEmployee(int eId);
	

}
