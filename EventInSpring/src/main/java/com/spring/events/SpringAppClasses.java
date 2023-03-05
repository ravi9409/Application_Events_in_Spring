package com.spring.events;

import com.spring.events.publisher.ZeeCafePublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAppClasses {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringAppClasses.class);
        ZeeCafePublisher bean=applicationContext.getBean("zeeCafePublisher",ZeeCafePublisher.class);
        bean.streamBigBangTheory("EP04");
    }

}
