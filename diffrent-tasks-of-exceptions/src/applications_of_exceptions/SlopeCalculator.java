package applications_of_exceptions;

public class SlopeCalculator {
    int x1;
    int y1;
    int x2;
    int y2;
    public SlopeCalculator(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public void calculateSlope(){
        try{
            if(x1==x2){
                throw new ArithmeticException("Divide-by-zero error: x1 and x2 cannot be equal.");
            }
            double slope=(double) (y2-y1)/(x2-x1);
            System.out.println("Slope of the line "+slope);
        }
        catch (ArithmeticException e){
            System.out.println("Error"+e.getMessage());
        }
        System.out.println("End of the Slope Calculation");
    }
}
