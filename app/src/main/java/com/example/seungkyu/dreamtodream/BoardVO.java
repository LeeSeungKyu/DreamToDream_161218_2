package com.example.seungkyu.dreamtodream;

/**
 * Created by junyepoh on 2016. 12. 14..
 */


public class BoardVO {
    private String title;
    private String content;
    private String date;
    private int hit;
    private String name;

    public BoardVO() {

    }
    public BoardVO(String title, String content, String date, int hit, String name) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.hit = hit;
        this.name = name;
    }
    public BoardVO(String title, String name, String date) {
        this.title = title;
        this.name = name;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", hit=" + hit +
                ", author='" + name + '\'' +
                '}';
    }
}
