package org.IT.service.serviceImp;

import org.IT.Entity.User;

import java.util.List;

public interface  UserServer {
    //1.查询全部学生个人信息
    List getuserShow();
    //2.查询学生学号 ID
    User getuserShowId(int id);
    //3.添加学生信息
    int  userInsert(User user);
    //4.修改学生xinx
    int userUpdates(User user);


}
