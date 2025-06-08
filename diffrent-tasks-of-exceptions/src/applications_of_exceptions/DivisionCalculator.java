package applications_of_exceptions;


public class DivisionCalculator {
    int dividend;
    int divisor;
    public DivisionCalculator(int dividend,int divisor){
        this.dividend=dividend;
        this.divisor=divisor;
    }
    public int divison(){
        try{
            return dividend / divisor;
        }
        catch (ArithmeticException e){
            System.out.println("Error:Cannot divide by zero!"+e);
            return -1;
        }

    }


}
