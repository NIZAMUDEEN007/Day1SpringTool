package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {
  
      public String name="Nizamudeen";
      @GetMapping("/name")
      
      public String getName()
      {
    	  return "Welcome "+name;
      }
}
