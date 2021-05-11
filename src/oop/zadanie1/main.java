package oop.zadanie1;

public class main {
    public static void main(String[] args) {
        Pies pies1 = new Pies("owczarek", "M");
        Pies pies2 = new Pies( "labrador", "F");



        pies1.setWiek(5);
        pies1.szczekanie();
        pies1.wyrukujparametry();


        Pies[] tablica_psow = {pies1, pies2};
        for (Pies pies : tablica_psow){
            pies.wyrukujparametry();
        }
        System.out.println(pies1.getWiek());
    }

}
