package org.example;

public class WidgetVisitor implements Visitor{
    @Override
    public String exportNumber(Number number) {
        return "Title: " + number.getTitle() + "\n" + "Value: " + number.getValue() + "\n";
    }

    @Override
    public String exportDatatable(Datatable datatable) {
        String[] data = datatable.getData();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) {
                sb.append(", ");
            }
        }

        String dataSeparateByComma = sb.toString();

        return "Title: " + datatable.getTitle() + "\n" + "Values: " + dataSeparateByComma + "\n";
    }

    @Override
    public String exportChart(Chart chart) {
        String[] data = chart.getData();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) {
                sb.append(", ");
            }
        }

        String dataSeparateByComma = sb.toString();

        return "Title: " + chart.getTitle() + "\n" + "Type: " + chart.getType() + "\n" + "Values: " + dataSeparateByComma + "\n";
    }
}
