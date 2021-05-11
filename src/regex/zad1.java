package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class zad1 {

    public static void main(String[] args) {
        String peselRegex = "[0-9]{11}";
        Pattern peselPattern = Pattern.compile(peselRegex);

        String input = "92391232123";
        Matcher matcher = peselPattern.matcher(input);
        if ( matcher.matches()){
            System.out.println("pesel jest poprawny ");
        }
        else {
        System.out.println(" pesel jest nie poprawny");
    }
    }
}
