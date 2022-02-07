package com.oneToManyProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.oneToManyProj.model"})
public class OneToManyProjMain {

    public static void main(String[] args) {
        SpringApplication.run(OneToManyProjMain.class);
    }
}
