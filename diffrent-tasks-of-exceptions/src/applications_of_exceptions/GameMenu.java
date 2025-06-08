package applications_of_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenu {
    public void showMenu(){
        Scanner sc=new Scanner(System.in);
        try{ boolean flag=false;
            while(!flag){
            System.out.println("Welcome to the Game Menu!..");
            System.out.println("1.Start Game\n2.Load Game\n3.Options\n4.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Starting Game!....");
                    break;
                case 2:
                    System.out.println("Loading the Game");
                    break;
                case 3:
                    System.out.println("Options Opening!...");
                    break;
                case 4:
                    System.out.println("Exiting Game!... Good Byeee");
                    flag=true;
                    break;
                default:
                    System.out.println("You Have entered invalid Choice select valid one");
            }
            }

            }
        catch(InputMismatchException e){
            System.out.println("Error: Invalid input! Please enter a number only."+e.getMessage());
        }
        System.out.println("End of the Game Menu!...");
    }
}
