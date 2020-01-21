package com.di.samples;

import com.di.samples.service.MessageRender;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by User on 12.01.2020.
 */
public class TestDI {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
//        ctx.load("classpath:app-context.xml");
        ctx.refresh();

        MessageRender messageRender = ctx.getBean("messageRender", MessageRender.class);
        System.out.println(messageRender.getMessageProvider().getMessage());
    }
}
