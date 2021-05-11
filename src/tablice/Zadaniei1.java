package tablice;
import java.util.Random;
import java.util.Scanner;
public class Zadaniei1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] tab = new int[x];
        Random rand = new Random();
        int suma = 0;
        int mediana = 0;
        for ( int i = 0; i < tab.length; i++){
            tab[i] = rand.nextInt(100);
        }
        for (int liczba:tab) {
            System.out.print(liczba+" , ");
            suma += liczba;
        }
        if (tab.length%2 !=0)
            mediana = tab[tab.length/2];
        else
            mediana = (tab[tab.length/2]+tab[tab.length/2+1])/2;

        System.out.println("suma: " + suma);
        System.out.println("średnia: " + (suma/tab.length));
        System.out.println("mediana: " + mediana);

        }

    }







