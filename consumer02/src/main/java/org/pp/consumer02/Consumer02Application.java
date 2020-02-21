package org.pp.consumer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Consumer02Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer02Application.class, args);
    }

}
