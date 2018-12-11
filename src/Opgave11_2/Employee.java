package Opgave11_2;


/**
 * <h1>Employee subclass of Doom</h1>
 *
 * <h2>What's in here?</h2>
 * In this subclass that extends the Person Class you'll find additions to the Person superclass
 * It includes getters and setters for all of the data fields included in this subclass
 * Also it has a Override of the toString method from the superclass
 *
 *
 * @author Nicklas Bring
 * 
 * @version 1.0 I presume
 * 
 * @since 1935
 * 
 * @// TODO: 11-12-2018 Bliv bedre 
 */

public class Employee extends Person{

    /**
     * Data fields in this class is String office, double salary, MyDate dateHired!
     */

    public String office;
    public double salary;
    public MyDate dateHired;

    /**
     * This constructor only takes a name as parameter, and will generate an Employee Object with standard parameters
     * except for name
     * @param name this string defines the name parameter from the superclass
     */

    public Employee(String name) {
        this(name,"none", 0 , new MyDate());
        }


    /**
     *
     * This constructor uses all new parameters added in this subclass and also the name from the superclass
     *
     * @param name
     * @param office
     * @param salary
     * @param dateHired
     */

    public Employee(String name , String office , double salary , MyDate dateHired) {
        super(name);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    /**
     * Getters and setters for new data fields
     */

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

    /**
     * Overrides the toString method from the superclass
     * @return String including employee name and classname
     */

    //The toString method that displays the class and the persons name
    @Override
    public String toString() {
        return "Name: " + getName() + "Class: " + this.getClass().getName();
    }

    /**
     * All javadoc made by COSBY AKA. HELLFIGHTER!..........
     */

}
