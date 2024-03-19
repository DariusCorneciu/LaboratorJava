package service;
import model.*;

import java.util.ArrayList;

public class StorageService {

    private ArrayList<Student> vStudent;
    private ArrayList<Professor> vProfessor;

    public StorageService(){
        vStudent = new ArrayList<Student>();
        vProfessor = new ArrayList<Professor>();
    }

    public void addStudent(Student student){
        this.vStudent.add(student);
    }
    public void addProfessor(Professor prof){
        this.vProfessor.add(prof);
    }
    public void removeStudent(Student rem){
        this.vStudent.remove(rem);
    }
    public void removeProfessor(Professor rem){
        this.vProfessor.remove(rem);
    }

}
