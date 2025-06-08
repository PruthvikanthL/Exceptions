package applications_of_exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatValidator {
    String dateInput;
    public DateFormatValidator(String dateInput) {
        this.dateInput = dateInput;}
    public void validateDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate parsedDate = LocalDate.parse(dateInput,formatter);
            System.out.println("Valid Date: "+parsedDate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid Date Format or Value: "+e.getMessage());
        }
        System.out.println("Date validation completed.");
    }
}
