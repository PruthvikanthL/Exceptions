package exceptions;

public class InvalidLoginStatus extends Exception{
    public InvalidLoginStatus(String message){
        super(message);
    }
}
