package com.stackroute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication

public class TrackServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrackServiceApplication.class, args);
    }
}