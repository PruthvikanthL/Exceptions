package applications_of_exceptions;

import exceptions.PastDateException;
import java.time.LocalDate;

public class BookingValidator {
    String bookingDateStr;
    public BookingValidator(String bookingDateStr) {
        this.bookingDateStr = bookingDateStr;
    }
    public void validateBookingDate() {
        try {
            LocalDate bookingDate = LocalDate.parse(bookingDateStr);
            LocalDate today = LocalDate.now();
            if (bookingDate.isBefore(today)) {
                throw new PastDateException("Booking date cannot be in the past: " + bookingDate);
            }
            System.out.println("Booking confirmed for: " + bookingDate);
        } catch (PastDateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid date format or unknown error.");
        }
        System.out.println("Booking validation completed.");
    }
}
