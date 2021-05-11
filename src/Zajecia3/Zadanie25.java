package Zajecia3;
import java.util.Random;

public class Zadanie25 {
    public static void main(String[] args){
        Random r = new Random();
        Integer i = -1;
        while (i % 5 !=0){
            i = r.nextInt( 100);
            System.out.println("Aktualna wartosc " + i);
        }
    }
}
