package org.pulcini.stubspy.service.notification;

import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * Created by mike on 6/27/2016.
 */
@Service
@ConditionalOnProperty(name = "app.notifications", havingValue = "mailgun")
public class MailgunService implements NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(MailgunService.class);

    Configuration config;

    @Value("${mailgun.to}")
    private String to;

    @Autowired
    public MailgunService(
            @Value("${mailgun.domain}") String domain,
            @Value("${mailgun.apiKey}") String apiKey,
            @Value("${mailgun.from.display}") String displayName,
            @Value("${mailgun.from.address}") String fromAddress ) {

        logger.info("Using Mailgun for notifications...");

        config = new Configuration()
                .domain(domain)
                .apiKey(apiKey)
                .from(displayName, fromAddress);
    }

    public void sendNotification(String subject, String content) {

        logger.info("Mailing notification to {}. Subject={}, content={}", to, subject, content);

        Mail.using(config)
                .to(to)
                .subject(subject)
                .text(content)
                .build()
                .send();
    }
}
