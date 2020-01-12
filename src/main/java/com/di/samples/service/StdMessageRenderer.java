package com.di.samples.service;

/**
 * Created by User on 12.01.2020.
 */
public class StdMessageRenderer implements MessageRender {

    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
