package com.jobsflow.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.jobsflow.data.*")
@EntityScan("com.jobsflow.data.*")
@SpringBootApplication(scanBasePackages={"com.jobsflow.data.*", "com.jobsflow.api.*"})
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);
  }
}
