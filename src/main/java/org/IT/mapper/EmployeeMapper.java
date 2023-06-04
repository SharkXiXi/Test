package org.IT.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.IT.Entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    @Update("update employee set name=#{name} where id=#{id}")
    @Transactional
    void update(Employee employee);

    @Insert("insert into  employee (`id`,`name`,`gender`,`phone`,`birthday`,`place`) values(#{id},#{name},#{gender},#{phone}) ")
    void add(Employee employee);
}
