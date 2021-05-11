package Zadania;

public class Zadanie2 {

    // 2*/ dubluje slowa atos portos aramis jako atos atos portos portos aramis aramis
    public static void main(String[] args) {
        System.out.println(doublewords("atos portos aramis"));
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
    public static String doublewords (String input) {
        String result = " ";

        for (String word : input.split(" ")){
          result = result + " " + word + " " + word;
        }
        return result;


    }

}
