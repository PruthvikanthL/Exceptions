package applications_of_exceptions;

import exceptions.InvalidEmailDomainException;
import exceptions.InvalidEmailFormatException;

public class EmailValidator {
    String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    public void validateEmail() {
        try {
            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                throw new InvalidEmailFormatException("Invalid email format:"+email);
            }
            try {
                if (!(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com") || email.endsWith("@outlook.com"))) {
                    throw new InvalidEmailDomainException("Unsupported email domain in: " + email);
                }
                System.out.println("Email is valid:"+email);
            } catch (InvalidEmailDomainException e) {
                System.out.println("Domain Error:"+e.getMessage());
            }
        } catch (InvalidEmailFormatException e) {
            System.out.println("Format Error: " + e.getMessage());
        }
        System.out.println("Email validation complete.");
    }
}
