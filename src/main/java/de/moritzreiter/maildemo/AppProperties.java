package de.moritzreiter.maildemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "maildemo")
@Data
public class AppProperties {

    private String from;
    private String to;
    private String subject;
    private String text;
}
