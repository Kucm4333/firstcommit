package oop.Zadanie2;

import oop.zadanie1.Pies;

public class main {
    public static void main(String[] args) {
        Pokoj pokoj3 = new Pokoj(2.2, 10.1,10.3);
        Pokoj pokoj2 = new Pokoj(3, 5,9.2);
        pokoj3.objetoscwy();
        pokoj3.polewy();

        System.out.println(pokoj3.objetosc());

        Pokoj[] Pokoj1 = {pokoj3, pokoj2};
        for (Pokoj pokoj : Pokoj1){
            pokoj.wyrukujparametry();
        }

    }





}
