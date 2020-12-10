package com.example.uthsav.Activities.Notifications;

public class Data
{
    private String userId;
    private int icon;
    private String body;
    private String title;

    public Data() {
    }

    public Data(String userId, int icon, String body, String title) {
        this.userId = userId;
        this.icon = icon;
        this.body = body;
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
