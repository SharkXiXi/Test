package org.IT;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.IT.mapper")
public class boot {
    public static void main(String[] args) {
        SpringApplication.run(boot.class,args);
    }
}
