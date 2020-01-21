package com.muathendirangu.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    void addObserver(Channel channel){
        this.channels.add(channel);
    }

    void removeObserver(Channel channel){
        this.channels.remove(channel);
    }

    void setNews(String news){
        this.news = news;

        for (Channel channel : this.channels){
            channel.update(this.news);
        }
    }
}
