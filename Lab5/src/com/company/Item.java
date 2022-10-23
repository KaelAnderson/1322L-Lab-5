package com.company;

abstract public class Item {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    Item(){
        title = "";
    }
    Item(String inputTitle){
        title = inputTitle;
    }
        abstract String getListing();

    @Override
    public String toString() {
        return title;
    }
}
