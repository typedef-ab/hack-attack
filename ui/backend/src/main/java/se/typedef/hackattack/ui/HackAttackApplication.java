package se.typedef.hackattack.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication
public class HackAttackApplication {

  public static void main(String[] args) {
    SpringApplication.run(HackAttackApplication.class, args);
  }
}
