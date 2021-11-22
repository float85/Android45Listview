package com.android45.listviewdemoandroid45;

public class ContactDemo {

    String name;
    int phoneNumber;
    boolean img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isImg() {
        return img;
    }

    public void setImg(boolean img) {
        this.img = img;
    }

    public ContactDemo(String name, int phoneNumber, boolean img) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.img = img;
    }
}
