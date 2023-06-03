package org.IT.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.IT.Entity.bc;
import org.IT.service.bcService;
import java.util.List;

@RestController
@RequestMapping("stocks")
public class bcController {
    @Autowired
    bcService bcService;
    //模糊查询
    @RequestMapping("/findStock")
    public List<bc> findStock(@Param("sname") String sname){
        QueryWrapper<bc> wrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(sname)){
            wrapper.like("sname",sname); //如果关键字不为空，则构造模糊查询条件
        }else wrapper = null;
        return bcService.list(wrapper);
    }
    //新增
    @RequestMapping("/add")
    public ResponseEntity<String> add(@RequestBody bc bc){
    if (StringUtils.isEmpty(bc.getSname())){
        return new ResponseEntity<>("{\"errCode\": 1001, \"errMsg\": \"股票名不能为空\"}", HttpStatus.BAD_REQUEST);
    }
    if (StringUtils.isEmpty(bc.getSid())){
        return new ResponseEntity<>("{\"errCode\": 1002, \"errMsg\": \"股票ID不能为空\"}", HttpStatus.BAD_REQUEST);
    }
    try{
        bcService.save(bc);
    }catch (Exception e){
       return new  ResponseEntity<>("{\"DataBaseError\":"+e.getMessage()+"}",HttpStatus.BAD_REQUEST);
    }
        return ResponseEntity.ok("{\"msg\":\"新增成功\"}");
    }
    //删除
    @RequestMapping("/remove")
    public ResponseEntity<String> remove(@RequestParam(value = "id",required = false) Integer id){
        if (id == null || id == 0){
            return new ResponseEntity<>("{\"errCode\": 2001, \"errMsg\": \"你想删库跑路？把ID写上！\"}", HttpStatus.BAD_REQUEST);
        }else {
            bcService.removeById(id);
            return ResponseEntity.ok("{\"msg\":\"删除成功\"}");
        }
    }
    //更新
    @RequestMapping("/update")
    public  ResponseEntity<String>  update(@RequestBody bc bc){
        if (bc.getId()==null){
            return new ResponseEntity<>("{\"errCode\": 3001, \"errMsg\": \"ID都没有，你改空气呢\"}", HttpStatus.BAD_REQUEST);
        }else {
            bcService.updateById(bc);
        }
            return ResponseEntity.ok("{\"msg\":\"改完了\"}");
    }

}
