package org.pulcini.stubspy.service.notification;

import com.mailgun.api.v3.MailgunMessagesApi;
import com.mailgun.client.MailgunClient;
import com.mailgun.model.message.Message;
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

    private final MailgunMessagesApi mailgunMessagesApi;
    private final String domain;
    private final String fromAddress;
    private final String to;

    @Autowired
    public MailgunService(
            @Value("${mailgun.domain}") String domain,
            @Value("${mailgun.apiKey}") String apiKey,
            @Value("${mailgun.from.display}") String displayName,
            @Value("${mailgun.from.address}") String fromAddress,
            @Value("${mailgun.to}") String to) {

        logger.info("Using Mailgun for notifications...");

        this.domain = domain;
        this.fromAddress = displayName + " <" + fromAddress + ">";
        this.to = to;
        this.mailgunMessagesApi = MailgunClient.config(apiKey)
                .createApi(MailgunMessagesApi.class);
    }

    public void sendNotification(String subject, String content) {

        logger.info("Mailing notification to {}. Subject={}, content={}", to, subject, content);

        Message message = Message.builder()
                .from(fromAddress)
                .to(to)
                .subject(subject)
                .text(content)
                .build();

        mailgunMessagesApi.sendMessage(domain, message);
    }
}
