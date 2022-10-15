package com.hemanth;

import com.hemanth.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class SpringJwtProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtProjectApplication.class, args);
    }

}
