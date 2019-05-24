package tdworniczak_workshops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100) + 1;        //losuje liczbę z zakresu 1 - 100

//        System.out.println(number);

        Scanner scan = new Scanner(System.in);
        while (true) {                                     //pętla, która wywołuje "zgadywanie" od nowa, ale dalej
            System.out.println("Zgadnij liczbę");           // tej samej liczby, którą na początku wylosowal program
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("To nie jest liczba!");
            }
            int n = scan.nextInt();
//        System.out.println(n);

            if (n > number) {
                System.out.println("Za dużo!");
            } else if (n < number) {
                System.out.println("Za mało!");
            } else {
                System.out.println("Zgadłeś");
                break;
            }
        }
    }
}
