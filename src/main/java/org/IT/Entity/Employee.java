package org.IT.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("employee")
public class Employee {
    private int id;
    private String name;
    private String gender;
    private String phone;
    private String birthday;
    private String place;

}
