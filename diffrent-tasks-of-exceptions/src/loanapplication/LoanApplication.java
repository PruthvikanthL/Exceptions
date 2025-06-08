package loanapplication;
import exceptions.AgeNotEligibleException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LoanApplication {
    String name;
    LocalDate dob;
    public LoanApplication(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;}
    public void apply() {
        try {
            int age = Period.between(dob,LocalDate.now()).getYears();
            if (age<21||age>60) {
                throw new AgeNotEligibleException("Age "+age+" is not eligible for loan (must be between 21 and 60).");
            }
            System.out.println("Loan application successful for " + name + ", Age: " + age);
        } catch (AgeNotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Loan Application System");
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your date of birth (yyyy-MM-dd):");
        String dobStr = sc.nextLine();

        try {
            LocalDate dob = LocalDate.parse(dobStr);
            LoanApplication loanApp = new LoanApplication(name, dob);
            loanApp.apply();
        } catch (Exception e) {
            System.out.println("Error: Invalid input - " + e.getMessage());
        }
    }
}

