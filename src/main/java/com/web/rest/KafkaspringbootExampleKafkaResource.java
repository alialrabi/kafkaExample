package com.web.rest;

import com.service.KafkaspringbootExampleKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/kafkaspringboot-example-kafka")
public class KafkaspringbootExampleKafkaResource {

    private final Logger log = LoggerFactory.getLogger(KafkaspringbootExampleKafkaResource.class);

    private KafkaspringbootExampleKafkaProducer kafkaProducer;

    public KafkaspringbootExampleKafkaResource(KafkaspringbootExampleKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
