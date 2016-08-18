package com.msteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NutaxiConfigServiceApplication {
    
    public String fixMeLater() {
        return "I'm here only so Checkstyle and PMD are not raging on utility class rules";
    }

    public static void main(String[] args) {
        SpringApplication.run(NutaxiConfigServiceApplication.class, args);
    }
}
