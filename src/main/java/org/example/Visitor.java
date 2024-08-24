package org.example;

public interface Visitor {
    String exportNumber(Number number);
    String exportDatatable(Datatable datatable);
    String exportChart(Chart chart);
}
