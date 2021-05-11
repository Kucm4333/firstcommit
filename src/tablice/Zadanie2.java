package tablice;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] tab = {"Adam", " Arek", " Ola", " Wiola", "Alex"};
        String sumaStr = "";
        for (String element : tab) {
            if (element.length() < 5)
                sumaStr = sumaStr + element + " ";


        }
        System.out.println(sumaStr);
    }
}
