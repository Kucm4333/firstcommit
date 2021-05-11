package Zajecia1;
import java.util.Scanner;
public class zadanieZrekrutacji {
    public static void main (String[] args){
        Scanner input = new Scanner ( System.in);
                System.out.println("wprowadz dlugosci bokow");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();


                System.out.println("a =" +a);
                System.out.println("b =" +b);
                System.out.println("c =" +c);


        if (a > b + c && b > a + c && c > a + b)
        {
            System.out.println("z tych boków da się stworzyc trójkąt");

        }
        else {
            System.out.println("z tych bokow nie da sie stworzyc trojkata");
        }


    }



}
