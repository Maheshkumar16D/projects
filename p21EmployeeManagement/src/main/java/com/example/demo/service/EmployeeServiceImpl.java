package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepo employeeRepo;
	@Override
	public void addEmployeeInDb(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(int eId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(eId);
	}

	@Override
	public void deleteAllEmployee() {
		// TODO Auto-generated method stub
		employeeRepo.deleteAll();
	}

	@Override
	public Employee getEmployee(int eId) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(eId).get();
	}

}
