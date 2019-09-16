package com.mostafa.springcould.testconfigclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limites")
public class Configuration {

    private int minimum;

    private int maximum;

    private String secret;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                ", secret='" + secret + '\'' +
                '}';
    }
}