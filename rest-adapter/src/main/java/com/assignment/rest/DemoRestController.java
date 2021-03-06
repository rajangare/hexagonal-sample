package com.assignment.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>("<h2>Welcome Hexagonal Demo !</h2>", HttpStatus.OK);
    }
}
