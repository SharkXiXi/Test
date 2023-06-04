package org.IT.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@TableName("student")
public class Student {
    private int id;
    private String name;
    private String gender;
    private Date birthday;
    private float score;
    private String email;
    private String phone;
    private int status;
}
