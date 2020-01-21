package com.muathendirangu.behavioral.observer;

import java.util.Observable;

public class NewsAgencyObservable extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
