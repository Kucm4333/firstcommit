
package Zajecia4;
import java.util.Scanner;
public class romb2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wysRombu = sc.nextInt();
        int polRombu;
        if (wysRombu % 2 == 0) {
            polRombu = wysRombu / 2 - 1;
        } else
            polRombu = wysRombu / 2;
        int count = 1;
        for (int i = 0; i < polRombu; i++) {
            char znak = 'A' - 1;
            for (int j = 0; j <= polRombu * 2; j++) {
                if ((j < polRombu - i) || (j > polRombu + i))
                    System.out.print(" ");
                else if (j <= polRombu) {
                    System.out.print(++znak);
                } else {
                    System.out.print(--znak);
                }
            }
            count++;
            System.out.println();
        }
        for (int i = polRombu; i >= 0; i--) {
            char znak = 'A' - 1;
            for (int j = 0; j <= polRombu * 2; j++) {
                if ((j < polRombu - i) || (j > polRombu + i))
                    System.out.print(" ");
                else if (j <= polRombu) {
                    System.out.print(++znak);
                } else {
                    System.out.print(--znak);
                }
            }
            count++;
            System.out.println();
        }
    }
}