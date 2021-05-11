package tablice;
public class Zadanie3b {
    public static void main(String[] args) {
        int[] tab = {1, 5, 3, 4, 5, 6, 7};
        // tutaj deklarujemy taka dlugosc drugiej tablicy zeby byla tej samej dlugosci co ta pierwsza
        int[] tab2 = new int[tab.length];
        int x;

        // deklarujemy zeby wypisalo wszystkie elementy danej tablicy
        for (int element : tab){
            System.out.print(element + " ");
        }
        System.out.println();
         // przypisuje wartosci jednej tablicy do drugiej
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[i];
        }
        // wypisuje wartosci drugiej tablicy
        for (int element : tab2) {
            System.out.print(element + " ");
        }


    }

}


