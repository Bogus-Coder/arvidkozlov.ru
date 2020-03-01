package ru.arvidkozlov.calc.data;

public class DataContainer {
    private String x1, x2, x3, x4, x5;

    public String getX1() {
        return x1;
    }

    public String getX2() {
        return x2;
    }

    public String getX3() {
        return x3;
    }

    public String getX4() {
        return x4;
    }

    public String getX5() {
        return x5;
    }

    protected void fill(Float j1, Float j2, Float j3, Float j4, Float j5) {
        x1 = Results.tos(j1);
        x2 = Results.tos(j2);
        x3 = Results.tos(j3);
        x4 = Results.tos(j4);
        x5 = Results.tos(j5);
    }
}
