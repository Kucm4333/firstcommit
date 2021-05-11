package tablice;

public class Zadanie5 {

    public static void main (String[] args){

        metodajeden();
        metodadwa(10);
       System.out.println( metodapomnoz(11));
    }
    public static void metodajeden(){

        System.out.println("Helloworld");
    }
    public static void metodadwa(int a){
        System.out.println("podano: " +a);
    }
    public static int metodapomnoz(int a){


        return a*2;
    }
}
