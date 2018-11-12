package Opgave11_2;

public class Employee extends Person{

    public String office;
    public double salary;
    public MyDate dateHired;

    public Employee(String name) {
        this(name,"none", 0 , new MyDate());
        }


    public Employee(String name , String office , double salary , MyDate dateHired) {
        super(name);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    //The toString method that displays the class and the persons name
    @Override
    public String toString() {
        return "Name: " + getName() + "Class: " + this.getClass().getName();
    }

}
