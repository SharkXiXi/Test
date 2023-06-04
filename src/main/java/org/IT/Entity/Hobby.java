package org.IT.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("book")
@Data
public class Hobby {
    @TableId("id")
    private Integer id;
    private String name;
    private String sex;
    private String year;
    private String email;
    private String hobby;

}
