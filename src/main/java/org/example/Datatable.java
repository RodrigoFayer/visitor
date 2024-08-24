package org.example;

public class Datatable implements Widget{
    private String title;
    private String[] data;

    public Datatable(String title, String[] data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.exportDatatable(this);
    }
}
