//package com.example.demo.controller;
//
//import com.example.demo.model.Dog;
//import com.example.demo.service.impl.dogService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/dog")
//public class DogController {
//    @Autowired
//    private dogService dogService;
//    //查询全部
//    @RequestMapping("/SelectAll")
//    public List<Dog> SelectAll() {
//        return dogService.list();
//    }
//    //根据ID删除
//    @RequestMapping("/removeById")
//    public void removeById(@RequestParam("id") int id){
//        dogService.removeById(id);
//    }
//    //根据ID更新
//    @RequestMapping("/updateById")
//    public void updateById(@RequestBody Dog dog){
//        dogService.updateById(dog);
//    }
//    //新增
//    @RequestMapping("/add")
//    public void add(@RequestBody Dog dog){
//        dogService.save(dog);
//    }
//}
