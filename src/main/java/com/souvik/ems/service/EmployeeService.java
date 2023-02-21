package com.souvik.ems.service;

import com.souvik.ems.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(Long id);
    void deleteEmployee(Long id);
}
