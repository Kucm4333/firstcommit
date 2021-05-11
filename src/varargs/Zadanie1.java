package varargs;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {


        varargsprzyklad(1,2,3,4,5,6,1,23,123,9182123);
        usunElement(4,7);
    }
    public static void varargsprzyklad(int... a){
        for (int element : a) {
            //System.out.println(element);
        }
      //  System.out.println(a[1]);
        // System.out.println();
    }
    public static void usunElement(int poz,int ...a){
        for (int i = poz; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=0;
        for (int element:a ) {
            System.out.println(element);
        }
    }

}

