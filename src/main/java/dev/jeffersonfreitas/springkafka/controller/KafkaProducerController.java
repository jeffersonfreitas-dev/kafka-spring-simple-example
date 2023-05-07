package dev.jeffersonfreitas.springkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.jeffersonfreitas.springkafka.service.KafkaProducerService;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {
  
  private final KafkaProducerService producerService;

  @Autowired
  public KafkaProducerController(KafkaProducerService producerService) {
    this.producerService = producerService;
  }

  @GetMapping
  public void sendMessage(@RequestParam("message") String message) {
    this.producerService.sendMessage(message);
  }
}
