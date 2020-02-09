package com.dev.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringBootController {

  @RequestMapping(value="/hello")
  public String hellSpringBoot() {
    return "hello";
  }
}


