package exceptions;

public class InvalidEmailDomainException extends Exception{
    public InvalidEmailDomainException(String message){
        super(message);
    }
}
