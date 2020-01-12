package com.di.samples.service;

/**
 * Created by User on 12.01.2020.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello DI world";
    }
}
