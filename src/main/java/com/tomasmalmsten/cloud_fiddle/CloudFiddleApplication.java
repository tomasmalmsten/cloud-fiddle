package com.tomasmalmsten.cloud_fiddle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CloudFiddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFiddleApplication.class, args);
	}

    @RestController
    class Hello {

        @GetMapping("/")
        public String hello() {
            return "hello"; // corresponds to hello.html in templates
        }
    }

}
