package com.example.dashed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import xyz.erupt.core.annotation.EruptScan;

@SpringBootApplication
@ComponentScan({"xyz.erupt", "com.example.dashed"}) // ↓ xyz.erupt必须有
@EntityScan({"xyz.erupt", "com.example.dashed"})    // ↓ 如果包名com.example.demo有变化
@EruptScan({"xyz.erupt", "com.example.dashed"})     // → 要修改为变化后的包名
public class DashedApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DashedApplication.class, args);

        String port = run.getEnvironment().getProperty("server.port");

        System.out.println("服务启动成功：http://localhost:" + port);
    }
}
