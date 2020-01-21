package com.muathendirangu.behavioral.observer;

import java.beans.PropertyChangeEvent;

public class BBCNewsChannel {
    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
