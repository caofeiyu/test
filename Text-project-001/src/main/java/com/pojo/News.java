package com.pojo;

import java.util.Date;

public class News {
    private String title;
    private String text;
    private String date;
    private String author;
    private String id;
    private String temperature;

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", test='" + text + '\'' +
                ", date=" + date +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }

    public News() {
    }

    public News(String title, String text, String date, String author, String id, String temperature) {
        this.title = title;
        this.text = text;
        this.date = date;
        this.author = author;
        this.id = id;
        this.temperature = temperature;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
