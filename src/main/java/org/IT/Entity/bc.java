package org.IT.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("basic_table")
public class bc {
    @TableId(value = "id")
    private Integer id;
    private String sid;
    private String sname;
    private float riseandfall;
    private float price;
}
