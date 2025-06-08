package applications_of_exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NullDateHandler {
    LocalDate date;
    public NullDateHandler(LocalDate date) {
        this.date = date;}
    public void formatDate() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = date.format(formatter);
            System.out.println("Formatted Date: " + formattedDate);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot format a null date.");
        }
        System.out.println("Date formatting complete.");
    }
}
