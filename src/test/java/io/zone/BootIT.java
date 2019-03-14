package io.zone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BootIT {

    @Autowired
    private ApplicationContext context;

    @DisplayName("spring context should be successfully initialized")
    @Test
    void should_initialize_spring_context() {
        assertNotNull(context);
    }

}