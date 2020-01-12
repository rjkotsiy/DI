package com.di.samples.service;

public interface MessageRender {
    void setMessageProvider(MessageProvider messageProvider);
    void render();
    MessageProvider getMessageProvider();
}
