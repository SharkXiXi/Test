package org.IT.controller;

import org.IT.Entity.User;
import org.IT.service.UserServerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserShowInfo {
    @Autowired
    private UserServerImp userServerImp;

    //1.查询全部数据
    @RequestMapping("/getuserShow")
   public List getuserShows() {
        List list = userServerImp.getuserShow();
        return list;

    }
    //2.查询学生学号ID
    @RequestMapping("/getuserShowid/{id}")
  public User getuserShowids(@PathVariable("id") int id){
       // System.out.println(userServerImp.getuserShowId(id));
        User user = userServerImp.getuserShowId(id);
        return user ;
    }
    //3.添加学生个人信息
    @RequestMapping("/userInsert")
    public int userInserts(@RequestBody User user){
        System.out.println(user);
     int number= userServerImp.userInsert(user);

      return number;
    }
    //4.修改学生个人信息
   @RequestMapping("/userUpset")
    public int  userUpdate(@RequestBody User user){
        int i = userServerImp.userUpdates(user);
        return  i;



    }
    //4.修改学生个人信息
    @RequestMapping("/userDelet/{id}")
    public void   userDelet(@PathVariable("id") int id){
        userServerImp.userDelets(id);




    }
}
