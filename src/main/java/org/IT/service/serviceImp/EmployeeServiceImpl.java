package org.IT.service.serviceImp;

import org.IT.Entity.Employee;
import org.IT.mapper.EmployeeMapper;
import org.IT.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service   //把当前类放到spring容器中
public class EmployeeServiceImpl implements EmployeeService {


    //当前是业务逻辑层--》数据访问层
    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
      return employeeMapper.selectList(null);

    }

    @Override
    public void removeById(Integer id) {
      employeeMapper.deleteById(id);
    }

    @Override
    public Employee findById(Integer id) {
        return  employeeMapper.selectById(id);
    }

    @Override
    public void Edit(Employee employee) {
      employeeMapper.update(employee);
    }

    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);

    }


}
