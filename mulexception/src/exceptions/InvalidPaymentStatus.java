package exceptions;

public class InvalidPaymentStatus extends Exception{
    public InvalidPaymentStatus(String message){
        super(message);
    }
}
