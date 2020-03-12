package com.pngyul.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("com.pngyul.springboot.mapper")
@SpringBootApplication
public class SpringBoot06BillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06BillApplication.class, args);
    }

}
