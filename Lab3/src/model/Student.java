package model;

public class Student extends Person{

    private int grupa;
    private float averagegrade;
    private static int studentid = 0;
    public Student(){
        studentid ++;
        this.grupa = -1;
        this.averagegrade = -1;
    }

    public Student(int grupa, float averagegrade) {
        this.grupa = grupa;
        studentid++;
        this.averagegrade = averagegrade;
    }

    public Student(Person copy, int grupa, float averagegrade) {
        super(copy);
        this.grupa = grupa;
        studentid++;
        this.averagegrade = averagegrade;
    }

    public Student(String name, String phonenumber, String email, int grupa, float averagegrade) {
        super(name, phonenumber, email);
        this.grupa = grupa;
        studentid++;
        this.averagegrade = averagegrade;
    }

}
