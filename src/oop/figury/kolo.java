package oop.figury;

import java.util.Scanner;

public class kolo {

    public kolo(double r) {
        this.r = r;
    }

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void zczytaj() {
        Scanner input= new Scanner(System.in);
        double r = input.nextDouble();
        this.r = r;
    }
}
