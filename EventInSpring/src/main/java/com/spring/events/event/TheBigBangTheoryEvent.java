package com.spring.events.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class TheBigBangTheoryEvent extends ApplicationEvent {

    private String episodeNo;

    public TheBigBangTheoryEvent(Object source) {
        super(source);
    }

    public TheBigBangTheoryEvent(Object source, Clock clock) {
        super(source, clock);
    }

    public String getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(String episodeNo) {
        this.episodeNo = episodeNo;
    }

    public TheBigBangTheoryEvent(Object source, String episodeNo) {
        super(source);
        this.episodeNo = episodeNo;
    }
}
