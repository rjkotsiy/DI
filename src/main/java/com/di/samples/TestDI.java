package com.di.samples;

import com.di.samples.service.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by User on 12.01.2020.
 */
public class TestDI {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
