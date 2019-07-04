package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "stringMessage",groupId = "Group_String")
    public void consume(String message)
    {
        System.out.println("published string message   "+message);
    }

    @KafkaListener(topics = "JsonObject",groupId = "Group_JsonObject",containerFactory = "UserListenerContainerFactory")
    public void consumeJson(@Payload User user)
    {
        System.out.println("published Json object   "+user.toString());
    }
}
