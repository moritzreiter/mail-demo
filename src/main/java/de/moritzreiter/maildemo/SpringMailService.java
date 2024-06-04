package de.moritzreiter.maildemo;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpringMailService {

    private final AppProperties appProperties;
    private final JavaMailSender mailSender;

    public void send() {
        val mail = new SimpleMailMessage();
        mail.setFrom(appProperties.getFrom());
        mail.setTo(appProperties.getTo());
        mail.setSubject(appProperties.getSubject());
        mail.setText(appProperties.getText());
        mailSender.send(mail);
    }
}
