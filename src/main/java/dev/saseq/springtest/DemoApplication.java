package dev.saseq.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** The main application class. */
@SpringBootApplication
public class DemoApplication {

  private DemoApplication() {}

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
