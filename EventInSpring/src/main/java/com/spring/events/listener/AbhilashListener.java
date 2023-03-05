package com.spring.events.listener;

import com.spring.events.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AbhilashListener implements ApplicationListener<TheBigBangTheoryEvent> {

    public void watchBigBang(String epNo){
        System.out.println("Abhilash started watching BBT");
        System.out.println("Abhilash: playing BBT: "+epNo);
    }
    //Instead of implementing the ApplicationListener and using @Override method you can also use @EventListener annotation for the given method instead of using @Override.
    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
