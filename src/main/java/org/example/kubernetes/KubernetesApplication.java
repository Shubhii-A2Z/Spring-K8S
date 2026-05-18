package org.example.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KubernetesApplication {
    public static void main(String[] args) {
        SpringApplication.run(KubernetesApplication.class, args);
    }
}
