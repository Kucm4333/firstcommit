package oop.zadanie1;

public class Pies {
    public Pies(String rasa, String plec) {
        this.wiek = 0;
        this.rasa = rasa;
        this.plec = plec;

    }

    private String rasa;
    private int wiek;
    private String plec;


    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public int getWiek(){
        return this.wiek;
    }
    public void szczekanie() {
        System.out.println("Hau Hau");
    }
    public void wyrukujparametry(){
        System.out.println(this.rasa);
        System.out.println(this.wiek);
        System.out.println(this.plec);
    }
}


