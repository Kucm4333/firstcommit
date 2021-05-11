package Zadania;

public class Zadanie3 {
    //jest zadany string
    //napisac metode w ktorej kazdy znak dubluje
    // np string abc wypisze jako aabbcc
    // 2*/ dubluje slowa atos portos aramis jako atos atos portos portos aramis aramis
    public static void main(String[] args) {

        System.out.println(doubleletters("adsef"));
    }

    // wazna notka, string mozna potraktowac jako tablice i mozna po nim iterowac
    public static String doubleletters(String input) {
        String result = " ";

        for (int i = 0; i < input.length(); i++) {
               char c = input.charAt(i);
                result = result + c + c;


        }
        return result;

    }
}
