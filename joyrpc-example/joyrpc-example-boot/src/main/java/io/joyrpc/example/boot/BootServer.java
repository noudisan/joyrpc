package io.joyrpc.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:application-server.properties"})
public class BootServer {

    public static void main(String[] args) {
        SpringApplication.run(BootServer.class, args);
    }
}
