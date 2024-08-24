package org.example;

public class Chart implements Widget{
    private String title;
    private String type;
    private String[] data;

    public Chart(String title, String type, String[] data) {
        this.title = title;
        this.type = type;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.exportChart(this);
    }
}
