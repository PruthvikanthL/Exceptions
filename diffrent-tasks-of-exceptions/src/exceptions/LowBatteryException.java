package exceptions;

public class LowBatteryException extends Exception{
    public LowBatteryException(String message){
        super(message);
    }
}
