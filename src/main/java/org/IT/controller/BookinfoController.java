package org.IT.controller;

import org.IT.Entity.bookinfo;
import org.IT.service.BookinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin //跨域访问注解
@RestController
@ResponseBody
@RequestMapping("/book")
public class BookinfoController {
    @Resource
    private BookinfoService bookinfoService;    @GetMapping("/list")
    public List<bookinfo> list(){
        return bookinfoService.list();
    }

    @GetMapping("/save")
    public bookinfo save(@RequestBody bookinfo bookinfo){
         bookinfoService.save(bookinfo);
         return bookinfo;
    }
    @PostMapping("/updata")
    public bookinfo updata(@RequestBody bookinfo bookinfo){
         bookinfoService.updateById(bookinfo);
        return bookinfo;
    }
    @PostMapping("/removebyid")
   public boolean removebyid(@RequestBody bookinfo bookinfo){
        return bookinfoService.removeById(bookinfo);
   }
    //根据 id 查询一条记录
    @GetMapping("/getByid/{ID}")
    public bookinfo getByid(@PathVariable int ID){
        return bookinfoService.getById(ID);
    }


}
