package com.example.fleamarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.fleamarket.mapper")
public class HistoryKindApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistoryKindApplication.class,args);
    }
}
