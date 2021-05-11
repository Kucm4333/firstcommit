package Zajecia3;

import java.util.Scanner;
public class Zadanie23 {
    public static void main(String[] args){

        String b = "";
        Scanner input = new Scanner(System.in);

        for (Integer i = 0; i <= 5; i++){
            String a =input.next();

          //  System.out.println("dodano " +a );
        b+=a;
        b+=" , ";
        }
        System.out.println(b);
    }
}
