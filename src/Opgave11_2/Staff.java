package Opgave11_2;

public class Staff extends Employee {

    public String title;

    public Staff(String name){
        super(name);
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    //The toString method that displays the class and the persons name
    @Override
    public String toString() {
        return "Name: " + getName() + "Class: " + this.getClass().getName();
    }
}
