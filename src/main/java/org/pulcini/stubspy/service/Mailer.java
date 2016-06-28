package org.pulcini.stubspy.service;

import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by mike on 6/27/2016.
 */
@Service
public class Mailer {

    Configuration config;

    @Value("${mailgun.enabled}")
    private boolean enabled;

    @Autowired
    public Mailer(
            @Value("${mailgun.domain}") String domain,
            @Value("${mailgun.apiKey}") String apiKey,
            @Value("${mailgun.from.display}") String displayName,
            @Value("${mailgun.from.address}") String fromAddress ) {
        config = new Configuration()
                .domain(domain)
                .apiKey(apiKey)
                .from(displayName, fromAddress);
    }

    public void sendMail(String to, String subject, String content) {
        if ( !enabled ) return;

        Mail.using(config)
                .to(to)
                .subject(subject)
                .text(content)
                .build()
                .send();
    }
}
