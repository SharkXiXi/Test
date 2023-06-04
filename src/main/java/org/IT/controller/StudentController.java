package org.IT.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.IT.Entity.Student;
import org.IT.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class StudentController {


    @Autowired
    private StudentService studentService;
    @RequestMapping("/getStudent")
    public List<Student> getStudent(){
        List<Student> students = studentService.list(null);
        return students;
        }
    @RequestMapping("/getOther")
    public List<Student> getOther(String name){
        LambdaQueryWrapper<Student> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getName,name);
        List<Student> students=studentService.list(queryWrapper);
        return students;
    }
    @RequestMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id) {
        Student student1 = studentService.getById(id);
        return student1;
    }
    @RequestMapping("/insertStudent")
    public Student insertStudent(@RequestBody Student student){
        studentService.save(student);
        return student;


    }
    @RequestMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        studentService.updateById(student);
        return student;

    }
    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
        studentService.removeById(id);
        return "删除成功";

    }
    }
