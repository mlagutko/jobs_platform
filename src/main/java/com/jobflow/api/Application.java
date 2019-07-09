package com.jobflow.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.jobflow.data.*")
@EntityScan("com.jobflow.data.*")
@SpringBootApplication(scanBasePackages="com.jobflow.data.*")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
