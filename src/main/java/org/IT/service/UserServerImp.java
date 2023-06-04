package org.IT.service;

import org.IT.Entity.User;
import org.IT.mapper.UserMapper;
import org.IT.service.serviceImp.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service/*标注他是个业务层*/
public class UserServerImp implements UserServer {
    @Autowired//注入mapper层接口
    private UserMapper userMapper;
    @Override//重写父类方法
    //1.查询全部学生个人信息
    public List getuserShow() {
        List<User> users = userMapper.selectList(null);
        return users;
    }
    //2.查询学生学号 ID
    @Override
    public User getuserShowId(int id) {
        User user = userMapper.selectById(id);
        return user;
    }
    //3.添加学生信息
    @Override
    public  int  userInsert(User user){

        return userMapper.insert(user);

    }

    @Override
    //4.修改学生信息

    public int userUpdates(User user){
        int update = userMapper.updateById(user);
        return  update;
    }

    //5.删除学生信息
    public void   userDelets(int id){
        userMapper.deleteById(id);
    }


}
