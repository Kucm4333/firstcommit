package oop.figury;
import static java.lang.Math.*;
public class kalkulator {
    public static double obliczobwod(kolo kolo ){
        double wynik;
        wynik = 2 * Math.PI * kolo.getR();
        return wynik;
    }
    public static double obliczpole( kolo xkolo ) {
        return Math.PI * xkolo.getR() * xkolo.getR();
    }
    public static double obliczobwodp(prostokat prostokat) {
        return prostokat.getA() * 2 +  prostokat.getB() * 2;
    }
    public static double obliczpolep ( prostokat prostokat) {
        return prostokat.getA() * prostokat.getB();
    }
    public static double obwodtrojkata ( trojkat y) {
        return (y.getA()+y.getB()+y.getC());
    }
    public static double poletrojkata ( trojkat x) {
         double p = (x.getA() + x.getB()  + x.getC())/2;

        return Math.sqrt(p*(p- x.getA())*(p- x.getB())*(p - x.getC()));
    }
}
