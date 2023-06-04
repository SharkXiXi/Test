package org.IT.controller;

import org.IT.Entity.Hobby;
import org.IT.mapper.HobbyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



//廖涛
@RestController
public class HobbyController {
    @Autowired
    private HobbyMapper hobbyMapper;
    @RequestMapping("/getAllHobby")
    public List<Hobby> getAllHobby(){
        List<Hobby> hobbies = hobbyMapper.selectList(null);
        return hobbies;
    }
//    这是查询所有
    @RequestMapping("/getHobbyIdWithPath/{id}")
    public Hobby getHobbyIdWithPath(@PathVariable("id") Integer id ){
        Hobby hobby = hobbyMapper.selectById(id);
        return hobby;
    }
//      这是根据路径查询id

    @RequestMapping("/insertHobby")
    public Hobby insertHobby(@RequestBody Hobby hobby) {             //添加注解传入json文件
        hobbyMapper.insert(hobby);
        System.out.println("新增成功，新增的数据是" + hobby);
        return hobby;
    }

//         增加内容

    @RequestMapping("/updateHobby")
    public String update(@RequestBody  Hobby hobby){
        hobbyMapper.updateById(hobby);
        System.out.println(hobby);
        return "修改成功";
    }
 //     内容修改

    @RequestMapping("/deleteHobbyById{id}")
    public void deleteHobbyById(@PathVariable("id") Integer id){
        hobbyMapper.deleteById(id);
        System.out.println("删除成功");
    }






}
