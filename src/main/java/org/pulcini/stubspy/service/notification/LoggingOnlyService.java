package org.pulcini.stubspy.service.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "app.notifications", havingValue = "loggingonly")
public class LoggingOnlyService implements NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(LoggingOnlyService.class);

    public LoggingOnlyService() {
        logger.warn("Using logging only for notifications; **no emails or other notifications will be sent**...");
    }

    @Override
    public void sendNotification(String subject, String content) {
        logger.info("Logging notification of ticket listing. Subject={}, content={}", subject, content);

    }
}
