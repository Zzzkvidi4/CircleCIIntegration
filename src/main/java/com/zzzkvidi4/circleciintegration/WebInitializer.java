package com.zzzkvidi4.circleciintegration;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Точка входа для приложения.
 */
public class WebInitializer extends SpringBootServletInitializer {
    @Override
    protected final SpringApplicationBuilder configure(
            final SpringApplicationBuilder builder
    ) {
        return builder.sources(CircleCiIntegrationApplication.class);
    }
}
