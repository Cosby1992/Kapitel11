package Opgave11_2;

public class Student extends Person {

    public String status;
    public final String FRESHMAN = "Freshman";
    public final String SOPHOMORE = "Sophomore";
    public final String JUNIOR = "Junior";
    public final String SENIOR = "Senior";

    public Student(String name) {
        super(name);
    }

    public Student(String name , String status){
        super(name);
        this.status = status;
    }


    //The toString method that displays the class and the persons name
    @Override
    public String toString() {
        return "Name: " + getName() + "Class: " + this.getClass().getName();
    }

}