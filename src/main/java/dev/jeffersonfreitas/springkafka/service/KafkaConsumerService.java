package dev.jeffersonfreitas.springkafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);

  @KafkaListener(topics = "first_topic")
  public void consumer(String message) {
    LOGGER.info(String.format("Message recieved -> %s", message));
  }
  
}
