package org.pulcini.stubspy.service;

import org.pulcini.stubspy.config.Alert;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mike on 6/28/2016.
 */
@Service
@ConfigurationProperties
public class AlertService {

    private List<Alert> alerts;

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }
}
