package com.boot.model;

/**
 * Created by Babu_2 on 04-07-2017.
 */
public class ToDo {
    private String id;
    private String description;
    private boolean isDone;

    public  ToDo(){ }
    public ToDo(String id, String description, boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
