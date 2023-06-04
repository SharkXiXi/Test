package org.IT.controller;

import org.IT.Entity.Employee;
import org.IT.service.EmployeeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    //查询所有
    @RequestMapping("/findAll")
    public  List<Employee> findAll(){
        return employeeService.findAll();
    }

    //条件查询
    @RequestMapping("/findId/{id}")
    public Employee findEmployee(@PathVariable("id")Integer id){
        return employeeService.findById(id);

    }

    //根据id删除
    @RequestMapping("/delete/{id}")
    public void deleteId(@PathVariable("id")Integer id){
        employeeService.removeById(id);
    }

    //添加数据
    @RequestMapping("/add")
    public String addEmployee(Employee employee){
        employeeService.add(employee);
        return "添加成功";

    }
    //修改数据
    @RequestMapping("/update")
    public  String updateEmployee(Employee employee){
        employeeService.Edit(employee);
        return "修改成功";
    }
}
