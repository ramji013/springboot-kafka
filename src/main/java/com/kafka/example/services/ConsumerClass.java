package com.kafka.example.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerClass {

    private final static Logger logger = LoggerFactory.getLogger(ConsumerClass.class);

    @KafkaListener(topics="user")
    public void consume(String message){
        logger.info(String.format("************ Consumer received message -> %s", message));
    }
}
