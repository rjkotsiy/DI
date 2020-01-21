package com.di.samples.service;

import org.springframework.stereotype.Service;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello DI world";
    }
}
