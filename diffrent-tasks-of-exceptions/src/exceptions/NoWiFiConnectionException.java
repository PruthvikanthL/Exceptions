package exceptions;

public class NoWiFiConnectionException extends Exception{
    public NoWiFiConnectionException(String message){
        super(message);
    }
}
