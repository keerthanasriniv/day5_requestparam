package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("home")
       public String get(@RequestParam String name){
      return "Hi I am "+name;
}

}