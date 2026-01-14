package com.guidev.festacrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class FestaCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(FestaCrmApplication.class, args);
    }

}
