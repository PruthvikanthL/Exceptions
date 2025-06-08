package applications_of_exceptions;

import java.util.InputMismatchException;

public class Rating {
    double rate;
    public Rating(double rate){
        this.rate=rate;
    }
    public void userrating(){
        try{
            System.out.println("User Rating is "+rate);
        }
        catch (InputMismatchException e){
            System.out.println("Error : Rating should be in numbers and between 1 - 5"+e.getMessage());
        }
        System.out.println("End of the User Rating");
    }
}
