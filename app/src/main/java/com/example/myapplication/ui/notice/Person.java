package com.example.myapplication.ui.notice;

public class Person {
    int numNotice;
    String notice;

    public Person(int numNotice, String notice) {
        this.numNotice = numNotice;
        this.notice = notice;
    }

    public int getNumNotice() {
        return numNotice;
    }

    public void setNumNotice(int numNotice) {
        this.numNotice = numNotice;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

}
