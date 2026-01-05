package com.xuenai.screenshot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@ComponentScan(basePackages = {"com.xuenai.screenshot", "com.xuenai.aicodegenerate"})
@SpringBootApplication
public class ScreenshotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScreenshotApplication.class, args);
    }
}
