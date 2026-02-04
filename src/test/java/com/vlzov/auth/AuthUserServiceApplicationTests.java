package com.vlzov.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class AuthUserServiceApplicationTests {

    @Test
    void contextLoads() {
        // Проверяем, что Spring-контекст поднимается без ошибок
    }
}