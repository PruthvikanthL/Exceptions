package runner;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGeneratorRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Welcome to The Random Number Generator Game\n");
        System.out.println("Note:The Range for this Game is 1 to 100 Guess between This");
        System.out.println("Now the Games Begins!..... All the Best");
        boolean flag=false;
        int randomnum = random.nextInt(100);

        while(!flag) {
            System.out.println("Guess the Number");
            int guessedNumber = sc.nextInt();
            try{
                System.out.println(randomnum);

                if (guessedNumber == randomnum) {
                    System.out.println("Congrates you Guessed the Correct Number");
                    flag=true;
                } else {
                    System.out.println("You Guessed Wrong number Try again");
                }
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
