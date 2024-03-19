package model;

public class Professor extends Person{

    private String course;
    private int year;

    public Professor(){
        this.course =" Course";
        this.year = -1;
    }

    public Professor(Person copy, String course, int year) {
        super(copy);
        this.course = course;
        this.year = year;
    }

    public Professor(String name, String phonenumber, String email, String course, int year) {
        super(name, phonenumber, email);
        this.course = course;
        this.year = year;
    }
}
