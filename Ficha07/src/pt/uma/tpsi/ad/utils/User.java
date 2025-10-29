package pt.uma.tpsi.ad.utils;

public abstract class User {

    protected String email, firstName, lastName;


    public User(){
        firstName = "";
        lastName = "";
        email = "";
    }
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public abstract void createEmail();

}
