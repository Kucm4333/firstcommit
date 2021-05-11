package tablice;

import java.util.Scanner;

public class Zadanie4b {
    int x,y;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] tab1 = new int[2][2];
        int[][] tab2 = new int[2][2];
        int[][] tab3 = new int[2][2];

        System.out.println("Wpisz wartosci pierwszej macierzy");
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                int x = input.nextInt();
                x = tab1[i][j];
            }
            System.out.print(tab1);
        }


        System.out.println("Wpisz wartosci drugiej macierzy");
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                int y = input.nextInt();
                y = tab2[i][j];
            }
        }
        System.out.print(tab2);
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                tab3[i][j] = tab1[i][j] + tab2[i][j];
            }
        }

        for (int i = 0; i < tab3.length; i++) {
            for (int j = 0; j < tab3.length; j++) {
                System.out.print(tab3[i][j]);
            }
            System.out.println();
                }

            }
        }
