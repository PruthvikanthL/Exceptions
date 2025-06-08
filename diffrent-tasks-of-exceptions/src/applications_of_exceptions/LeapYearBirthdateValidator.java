package applications_of_exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LeapYearBirthdateValidator {
    String dateInput;
    public LeapYearBirthdateValidator(String dateInput) {
        this.dateInput = dateInput;
    }
    public void validate() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate birthdate = LocalDate.parse(dateInput, formatter);
            System.out.println("Valid birthdate: " + birthdate);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date entry. Please check if the year is a leap year.");
        }
        System.out.println("Date validation completed.");
    }
}
