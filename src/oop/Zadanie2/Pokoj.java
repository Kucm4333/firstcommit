package oop.Zadanie2;

public class Pokoj {
    public Pokoj(double wysokosc, double szerokosc, double dlugosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;

    }

    private double wysokosc;
    private double szerokosc;
    private double dlugosc;

    public void kons2(double szerokosc, double dlugosc) {
        this.wysokosc = 2.4;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }

    public double pole() {

        double polepokoju;
        polepokoju = this.szerokosc * this.dlugosc;
        return polepokoju;
    }

    public void polewy() {
        System.out.println("pole pokoju =" + pole());
    }

    public double objetosc() {
        double objetoscpokoju;
        objetoscpokoju = this.szerokosc * this.dlugosc * this.wysokosc;
        return objetoscpokoju;
    }

    public void objetoscwy() {
        System.out.println("objetosc pokoju=" + objetosc());
    }

    public void wyrukujparametry() {
        System.out.println(this.szerokosc);
        System.out.println(this.dlugosc);
        System.out.println(this.wysokosc);
    }
}