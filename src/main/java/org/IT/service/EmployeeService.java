package org.IT.service;

import org.IT.Entity.Employee;

import java.util.List;

public interface EmployeeService{
     List<Employee> findAll();
     void removeById(Integer id);
     Employee findById(Integer id);
     void Edit(Employee employee);
     void add(Employee employee);


}
