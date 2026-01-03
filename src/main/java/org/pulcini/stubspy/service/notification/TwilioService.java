package org.pulcini.stubspy.service.notification;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
@ConditionalOnProperty(name = "app.notifications", havingValue = "twilio")
public class TwilioService implements NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(TwilioService.class);

    @Value("${twilio.to}")
    private String toStr;

    @Value("${twilio.from}")
    private String fromStr;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.accountSid}")
    private String accountSid;

    private PhoneNumber to;
    private PhoneNumber from;

    @PostConstruct
    private void init() {
        logger.info("Using Twilio for notifications...");

        Twilio.init(accountSid, authToken);
        to = new PhoneNumber(toStr);
        from = new PhoneNumber(fromStr);
    }

    @Override
    public void sendNotification(String subject, String content) {
        String message = subject + " ... " + content;
        logger.info("Sending SMS notification to {}. Message={}", to, message);
        Message.creator(to, from, message).create();
    }
}
