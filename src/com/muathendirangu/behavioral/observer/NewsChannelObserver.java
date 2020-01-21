package com.muathendirangu.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsChannelObserver implements Observer {

    private String news;

    @Override
    public void update(Observable observable, Object o) {
        this.setNews((String) news);
    }

    void setNews(String news) {
        this.news = news;
    }

    String getNews() {
        return news;
    }
}
