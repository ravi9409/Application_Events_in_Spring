package com.spring.events.publisher;

import com.spring.events.event.TheBigBangTheoryEvent;
import com.spring.events.listener.AbhilashListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void streamBigBangTheory(String episodeNo){
        System.out.println("Zee Cafe starting BBT "+episodeNo);
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(this,episodeNo));
    }

}
