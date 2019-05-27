package tdworniczak_workshops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100) + 1;

//        System.out.println(number);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Zgadnij liczbę");           
            String whatever = scan.nextLine();
            try {

                int a = Integer.parseInt(whatever);
                if (a > number) {
                    System.out.println("Za dużo!");
                } else if (a < number) {
                    System.out.println("Za mało!");
                } else {
                    System.out.println("Zgadłeś");
                }
            } catch (NumberFormatException e) {
                System.out.println("Podana wartośc nie jest liczbą!");
            }
        }
    }
}

