package com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaspringbootExampleKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(KafkaspringbootExampleKafkaConsumer.class);
    private static final String TOPIC = "topic_kafkaspringbootexample";

    @KafkaListener(topics = "topic_kafkaspringbootexample", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
