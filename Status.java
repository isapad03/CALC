//This work is licensed under a Creative Commons Attribution NonCommercial NoDerivatives 4.0 International License

import java.awt.*;

public class Status {
    private double o1,o2;
    private char op;
    private String text;
    private Color color;

    public Status(double o1, double o2, char op,String text,Color color) {
        this.o1 = o1;
        this.o2 = o2;
        this.op = op;
        this.text = text;
        this.color = color;
    }

public Status(Color color) {
        this.color = color;
}

    public double getO1() {
        return o1;
    }
    public double getO2() {
        return o2;
    }
    public char getOp() {return op;}
    public String getText() {return text;}
    public Color getColor() {return color;}
}
