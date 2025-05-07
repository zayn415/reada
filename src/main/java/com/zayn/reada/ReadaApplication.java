package com.zayn.reada;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zayn
 */
@SpringBootApplication
@MapperScan("com.zayn.reada.mapper")
public class ReadaApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ReadaApplication.class, args);
    }
    
}
