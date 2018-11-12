package Opgave11_2;

public class Faculty extends Employee {

    public String officeHours;
    public String rank;


    public Faculty(String name) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }


    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    //The toString method that displays the class and the persons name
    @Override
    public String toString() {
        return "Name: " + getName() + "Class: " + this.getClass().getName();
    }
}
