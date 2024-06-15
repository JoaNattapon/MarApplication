package org.example.marstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "org.example.marstest.Register.Repository")
public class MarsTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(MarsTestApplication.class, args);



    }
}
