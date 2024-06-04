package de.moritzreiter.maildemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.mail")
@Data
public class SpringMailProperties {

    private String host;
    private int port;
    private String username;
    private String password;
}
