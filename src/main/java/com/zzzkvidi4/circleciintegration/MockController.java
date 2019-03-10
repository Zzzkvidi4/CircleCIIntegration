package com.zzzkvidi4.circleciintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class MockController {
    @GetMapping
    public String get() {
        return "Hello, world!";
    }
}
