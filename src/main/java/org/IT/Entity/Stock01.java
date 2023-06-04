package org.IT.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Stock01 {
    @TableId("id")
    private int id;
    private String sid;
    private String sname;
    private String kinds;
    private String brief;
    private String price;
}
