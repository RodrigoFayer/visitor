package org.example;

public class Number implements Widget{
    private String title;
    private int value;

    public Number(String title, int value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.exportNumber(this);
    }
}
