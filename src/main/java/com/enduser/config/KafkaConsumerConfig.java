package com.enduser.enduser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    private Logger logger= LoggerFactory.getLogger(KafkaConsumerConfig.class);

    @KafkaListener(topics = "location-update-topic",groupId = "group-1")
    public void updatedLocation(String value){
        this.logger.info("fetched location is {}",value);
    }
}
