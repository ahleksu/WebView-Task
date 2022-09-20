package com.example.webview_task;

/** This class will serve as the information filler for the view binding. */
public class User {

    String version_name, version_description;
    int imageId;

    public User(String version_name, String version_description, int imageId) {
        this.version_name = version_name;
        this.version_description = version_description;
        this.imageId = imageId;
    }
}
