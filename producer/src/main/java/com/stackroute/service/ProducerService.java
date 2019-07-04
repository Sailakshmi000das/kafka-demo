package com.stackroute.service;

import com.stackroute.domain.User;

public interface ProducerService {

    public String sendString(String message);
    public String sendJsonObject(User user);
}
