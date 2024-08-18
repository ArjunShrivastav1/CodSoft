//      Number Guessing Game

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randdomNumber = rand.nextInt(100) + 1;
        int guess_try = 0;
        int win = 0;
        int lost = 0;
        Scanner sc = new Scanner(System.in);

        while (guess_try < 5) {
            System.out.println("Enter your guess from 1 to 100");
            int user_guessed_number = sc.nextInt();
            guess_try++;

            if (user_guessed_number == randdomNumber) {
                win++;
                System.out.println("congratulations ! You guessed the right number ");
                System.out.println("you won" + win + "times");
                break;
            }

            else if (user_guessed_number > randdomNumber) {
                lost++;
                System.out.println("oops !!you guessed a higher number.Guess a lower number");
            }

            else {
                lost++;
                System.out.println("oops !!you guessed a lower number .Guess a higher number");
                // System.out.println("randon number is " + randdomNumber);
            }
            if (guess_try == 5) {
                System.out.println("Sorry,you have used all your tries .the randon numbr was : " + randdomNumber);
            }
            System.out.println("Out of 5 tries, you won " + win + " times and lost " + lost + " times.");

        }
        sc.close();

    }

}