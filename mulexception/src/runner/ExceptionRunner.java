package runner;

import exceptions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;


public class ExceptionRunner {
    public static void main(String[] args) throws InvalidNameLength,InvalidIncompleteTask,InvalidAgeCheckException,InvalidLoginStatus,InvalidPaymentStatus,InvalidProductAvailabilityCheck,InvalidProfileValidationCheck,InvalidOtpValidationCheck,IOException,FileNotFoundException,SQLException,ClassNotFoundException,InterruptedException,NullPointerException,ArithmeticException,IllegalArgumentException{
        ExceptionRunner runner=new ExceptionRunner();
        runner.Namecheck();
        runner.taskcheck();
        runner.agecheckforvote();
        runner.loginstatuscheck();
        runner.paymentstatuscheck();
        runner.productavailabilitycheck();
        runner.profileCompleteCheck();
        runner.otpValidationCheck();
        runner.inputoutexception();
        runner.filenotfound();
        runner.sqlexception();
        runner.classnotfound();
        runner.interrupted();
        runner.nullPointerExample();
        runner.arithmeticExample();
        runner.illegalArgumentExample();
    }
    public void Namecheck() throws InvalidNameLength{
        String name="Pruthvi";
        if(name.length()<3){
            throw new InvalidNameLength("Name Length should be Greater then 3 char");
        }
        else{
            System.out.println("Name is saved");
        }
    }
    public void taskcheck() throws InvalidIncompleteTask{
        boolean task=true;
        if(!task){
            throw new InvalidIncompleteTask("Task is not complted");
        }
        else{
            System.out.println("Task is completed");
        }
    }
    public void agecheckforvote()throws InvalidAgeCheckException{
        int age=13;
        if(age<18){
            throw  new InvalidAgeCheckException("your not eligible for vote");
        }
        else{
            System.out.println("your can vote");
        }
    }
    public void loginstatuscheck() throws InvalidLoginStatus{
        boolean login=true;
        if(!login){
            throw new InvalidLoginStatus("Your not logged in");
        }
        else{
            System.out.println("your are successfully logged in");
        }
    }
    public void paymentstatuscheck() throws InvalidPaymentStatus{
        boolean payment=true;
        if(!payment){
            throw new InvalidPaymentStatus("Payment is Failed");
        }
        else{
            System.out.println("payment is success");
        }
    }
    public void productavailabilitycheck() throws InvalidProductAvailabilityCheck{
        boolean product=true;
        if(!product){
            throw new InvalidProductAvailabilityCheck("Product is not available now");
        }
        else{
            System.out.println("Product is available");
        }
    }
    public void profileCompleteCheck() throws InvalidProfileValidationCheck{
        boolean profile=true;
        if(!profile){
            throw new InvalidProfileValidationCheck("Profile is not verified");
        }
        else{
            System.out.println("Profile is valid and verified");
        }
    }
    public void otpValidationCheck() throws InvalidOtpValidationCheck{
        boolean otp=true;
        if(!otp){
            throw new InvalidOtpValidationCheck("Wrong OTP");
        }
        else{
            System.out.println("You Have Entered Right OTP");
        }
    }
    public void inputoutexception() throws IOException{
        boolean input=true;
        if(!input){
            throw new IOException();
        }
    }
    public void filenotfound() throws FileNotFoundException {
        boolean file=true;
        if(!file){
            throw new FileNotFoundException();
        }
    }
    public void sqlexception() throws SQLException{
        boolean sqlexception=true;
        if(!sqlexception){
            throw new SQLException();
        }
    }
    public void classnotfound() throws ClassNotFoundException{
        boolean classfound=true;
        if (!classfound) {
            throw new ClassNotFoundException();
        }
    }
    public void interrupted() throws InterruptedException{
        boolean interrupted=true;
        if(!interrupted){
            throw new InterruptedException();
        }
    }
    public void nullPointerExample() throws NullPointerException {
        String data = null;
        if (data == null) {
            throw new NullPointerException("Data is null");
        }
    }
    public void arithmeticExample() throws ArithmeticException{
        int divisor = 0;
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
    public void illegalArgumentExample() throws IllegalArgumentException{
        int age = -1;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }


}
