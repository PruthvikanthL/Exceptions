package applications_of_exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCalculator {
    String startDate;
    String endDate;
    public DateDifferenceCalculator(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public void calculateDifference() {
        try {
            if (startDate == null || endDate == null) {
                throw new NullPointerException("One of the dates is null.");}
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date1 = LocalDate.parse(startDate, formatter);
            LocalDate date2 = LocalDate.parse(endDate, formatter);
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);
            System.out.println("Days between dates: " + Math.abs(daysBetween));
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format. Use dd-MM-yyyy");
        }
        System.out.println("Date difference calculation complete.");
    }
}
