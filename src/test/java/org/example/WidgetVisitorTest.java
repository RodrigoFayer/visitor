package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WidgetVisitorTest {
    @Test
    void shouldExportNumber() {
        Number number = new Number("Number", 10);
        WidgetVisitor widgetVisitor = new WidgetVisitor();
        String result = number.accept(widgetVisitor);
        assertEquals("Title: Number\nValue: 10\n", result);
    }

    @Test
    void shouldExportDatatable() {
        Datatable datatable = new Datatable("Datatable", new String[]{"A", "B", "C"});
        WidgetVisitor widgetVisitor = new WidgetVisitor();
        String result = datatable.accept(widgetVisitor);
        assertEquals("Title: Datatable\nValues: A, B, C\n", result);
    }

    @Test
    void shouldExportChart() {
        Chart chart = new Chart("Chart", "Line", new String[]{"1", "2", "3"});
        WidgetVisitor widgetVisitor = new WidgetVisitor();
        String result = chart.accept(widgetVisitor);
        assertEquals("Title: Chart\nType: Line\nValues: 1, 2, 3\n", result);
    }
}