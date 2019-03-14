package io.zone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import java.util.Arrays;

/*
 * Notification Service launch configuration.
 */
@SpringBootApplication
@EnableWebFlux
public class Boot implements WebFluxConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> System.out.println("Service started with args : " + Arrays.toString(args));
    }

    @Override
    public void configureHttpMessageCodecs(ServerCodecConfigurer config) {
        config.registerDefaults(true);// to trace request with correlation ids
    }
}
