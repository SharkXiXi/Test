package org.IT.service.serviceImp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.IT.Entity.Student;
import org.IT.mapper.StudentMapper;
import org.IT.service.StudentService;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

}
