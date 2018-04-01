package com.guilherme.ws.wsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class WsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsServiceApplication.class, args);
    }
}
