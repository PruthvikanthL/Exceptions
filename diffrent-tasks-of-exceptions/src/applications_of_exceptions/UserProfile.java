package applications_of_exceptions;

public class UserProfile {
    String name;
    public UserProfile(String name){
        this.name=name;
    }
    public void profile() throws NullPointerException{
        if(name.equals("null")||name.equals("")||name.matches("^[0-9].*")){
            System.out.println("User Name Cannot Be Null or Numbers !...");
            throw new NullPointerException();
        }
        else{
            System.out.println("Hey User "+name+" Welcome to our portal");

        }


    }
}
