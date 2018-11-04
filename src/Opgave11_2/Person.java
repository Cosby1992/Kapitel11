package Opgave11_2;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;


    public Person(String name){
        this.name = name;
    }



    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    //The toString method that displays the class and the persons name
    @Override
    public String toString(){
        return "Name: " + getName() + "Class: " + this.getClass().getName();
    }


}
