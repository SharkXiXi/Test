package org.IT.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@TableName("bookinfo")
@Component
public class bookinfo {
    String name;
    String zuozhe;
    String chubanshe;
    String chubanriqi;
    String jianjie;
    int ID;
}
