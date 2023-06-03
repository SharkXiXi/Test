package org.IT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.IT.mapper.testMapper;
import org.springframework.web.bind.annotation.RestController;
import org.IT.Entity.*;

import java.util.List;


@RestController
@RequestMapping("/getUserbyId")
public class test {
    @Autowired private testMapper testMapper;
    public user getUserbyId(){
        return testMapper.selectById("*");
    }
}
