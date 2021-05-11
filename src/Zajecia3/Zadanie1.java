package Zajecia3;

import java.util.Scanner;
public class Zadanie1 {
    public static void main (String[] args){
        Integer number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        switch (number){
            case 1: {
                System.out.println("dla 1 odpowiednim znakiem jest !");
                break;

            }
            case 2: {
                System.out.println("dla 2 odpowiednim znakiem jest @");
                break;
            }
            case 3:{
                System.out.println("dla 3 odpowiednim znakiem jest #");
                break;
            }
            case 4:{
                System.out.println("dla 4 odpowiednim znakiem jest $");
                break;
            }
            case 5:{
                System.out.println("dla 5 odpowiednim znakiem jest %");
                break;
            }
            case 6:{
                System.out.println("dla 6 odpowiednim znakiem jest ^");
                break;
            }
            case 7:{
                System.out.println("dla 7 odpowiednim znakiem jest &");
                break;
            }
            case 8:{
                System.out.println("dla 8 odpowiednim znakiem jest *");
                break;
            }
            case 9:{
                System.out.println("dla 9 odpowiednim znakiem jest (");
                break;
            }
            default : {
                System.out.println("Error");
                break;
            }
        }
    }
}
