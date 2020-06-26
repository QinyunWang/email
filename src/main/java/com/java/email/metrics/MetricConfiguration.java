package com.java.email.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricConfiguration {

    @Bean(name = "emailCounter")
    public Counter emailCounter(MeterRegistry registry) {
        return Counter
                .builder("api.email.counter")
                .description("Amount of email api called")
                .register(registry);
    }
}
