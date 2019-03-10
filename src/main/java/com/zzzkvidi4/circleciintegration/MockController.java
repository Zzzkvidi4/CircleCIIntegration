package com.zzzkvidi4.circleciintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Тестовый контроллер.
 */
@RestController
@RequestMapping(path = "/hello")
public class MockController {
    /**
     * Метод для получения приветственной строки.
     *
     * @return строка приветствия.
     */
    @GetMapping
    public final String getHelloMsg() {
        return "Hello, world!";
    }
}
