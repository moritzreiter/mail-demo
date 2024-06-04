package de.moritzreiter.maildemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMailServiceTest {

    @Autowired
    private SpringMailService mailService;

    @Test
    void send() {
        mailService.send();
    }
}
