package de.moritzreiter.maildemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleMailServiceTest {

    @Autowired
    private SimpleMailService simpleMailService;

    @Test
    void send() {
        simpleMailService.send();
    }
}
