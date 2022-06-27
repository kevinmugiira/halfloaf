package com.example.halfloaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class DemoApplication {

        @RequestMapping("/greeting")
        @ResponseBody
        String greetings() {
           return "hello Mr Kevin";
        }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
