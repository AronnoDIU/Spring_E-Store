package com.aronno.spring_estore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEStoreApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringEStoreApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Spring E-Store application");
        SpringApplication.run(SpringEStoreApplication.class, args);
        logger.info("Spring E-Store application started successfully");
    }
}
