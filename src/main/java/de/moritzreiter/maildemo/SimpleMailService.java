package de.moritzreiter.maildemo;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleMailService {

    private final AppProperties appProperties;
    private final SpringMailProperties springMailProperties;

    public void send() {
        try (val mailer = MailerBuilder
                .withSMTPServerHost(springMailProperties.getHost())
                .withSMTPServerPort(springMailProperties.getPort())
                .withSMTPServerUsername(springMailProperties.getUsername())
                .withSMTPServerPassword(springMailProperties.getPassword())
                .buildMailer()) {

            val mail = EmailBuilder.startingBlank()
                    .from(appProperties.getFrom())
                    .to(appProperties.getTo())
                    .withSubject(appProperties.getSubject())
                    .withPlainText(appProperties.getText())
                    .buildEmail();
            mailer.sendMail(mail);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
