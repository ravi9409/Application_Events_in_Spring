package com.spring.events.listener;

import com.spring.events.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.stereotype.Component;

@Component
public class WillyListener implements ApplicationListener<TheBigBangTheoryEvent> {

    public void watchBigBang(String epNo){
        System.out.println("Willy: Started watching BBT");
        System.out.println("Willy: Playing BBT: "+epNo);
    }

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
