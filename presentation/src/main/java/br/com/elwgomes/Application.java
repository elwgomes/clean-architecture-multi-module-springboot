package br.com.elwgomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {
  public static void main(String[] args) {
    log.info("Application is getting started...");
    SpringApplication.run(Application.class, args);
    log.info("Application is running on...");
  }
}
