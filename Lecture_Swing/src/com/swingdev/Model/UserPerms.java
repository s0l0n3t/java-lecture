package com.swingdev.Model;

public class UserPerms {
    private boolean writing;
    private boolean reading;
    private boolean adding;

    public UserPerms(){

    }
    public UserPerms(boolean writing,boolean reading,boolean adding){
        this.writing = writing;
        this.adding = adding;
        this.reading = reading;
    }

    public void setWriting(boolean writing) {
        this.writing = writing;
    }

    public void setReading(boolean reading) {
        this.reading = reading;
    }

    public void setAdding(boolean adding) {
        this.adding = adding;
    }

    public boolean isWriting() {
        return writing;
    }

    public boolean isReading() {
        return reading;
    }

    public boolean isAdding() {
        return adding;
    }
}
