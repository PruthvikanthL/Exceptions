package applications_of_exceptions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class AgeCalculator {
    String birthDateStr;
    public AgeCalculator(String birthDateStr) {
        this.birthDateStr = birthDateStr;
    }
    public void calculateAge() {
        try {
            LocalDate birthDate = LocalDate.parse(birthDateStr);
            LocalDate currentDate = LocalDate.now();
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Error: Birthdate is in the future.");
                return;
            }
            Period age = Period.between(birthDate, currentDate);
            System.out.println("Age: "+age.getYears()+"years");
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format.");
        }
        System.out.println("Age calculation completed.");
    }
}
