package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> getHelloWorld() throws UnknownHostException {
        String address = InetAddress.getLocalHost().getHostAddress();
        String hostname = InetAddress.getLocalHost().getHostName();

        return ResponseEntity.ok("Hello World Spring Boot + Kubernetes v2\nHost: " + hostname + " \nAddress: " + address);
    }
}
