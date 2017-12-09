package se.typedef.hackattack.ui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @RequestMapping("/hello")
  public String user() {
    return "Hej!";
  }
}
