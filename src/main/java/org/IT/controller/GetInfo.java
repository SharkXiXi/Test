package org.IT.controller;

import org.IT.Entity.Stock01;
import org.IT.mapper.StockMapper01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller //控制层
@ResponseBody//该方法的返回值被自动解析为json格式
public class GetInfo {
    @Autowired//注入mapper层接口，用mapper接口查出数据库的数据，展示在网页上
    private StockMapper01 stockMapper01;
    @RequestMapping("/getinfo")//设置请求路径
    public List<Stock01> getStock01s(){
        //调用mapper接口获取数据
        List<Stock01> stock01s =stockMapper01.selectList(null);
        return stock01s;
    }
    @RequestMapping("/getStock01")
    public Stock01 getStock01(Integer id){
        Stock01 stock01=stockMapper01.selectById(id);
        return stock01;
    }
    @RequestMapping("/insertStock01")
    public Stock01 insertStock01(@RequestBody Stock01 stock01){
        stockMapper01.insert(stock01);
        System.out.println("新增成功，新增的数据是："+stock01);
        return stock01;
    }
    @RequestMapping("/updateStock01")
    public Stock01 updateStock01(@RequestBody Stock01 stock01){
        stockMapper01.updateById(stock01);
        System.out.println("修改数据成功，修改后的数据是"+stock01);
        return stock01;
    }
    @RequestMapping("/delStock01")
    public String delStock01(Integer id ){
        stockMapper01.deleteById(id);
        System.out.println("删除成功");
        return "删除成功";
    }
}
