package com.mostafa.springcould.testconfigclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
class test {
    @Value("${message}")
    private String message;

    @Autowired
    private Configuration configuration;

    @Autowired
    private Environment environment;

    private Logger logger = LoggerFactory.getLogger(this.getClass());;

    @GetMapping("message")
    public String getMessage(){
        logger.info("this port is {}", environment.getProperty("local.server.port"));
        return message;
    }

    @GetMapping("configuration")
    public String getConfiguration(){
        return configuration.toString();
    }

}
