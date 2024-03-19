import java.util.Scanner;
import service.*;
public class Application {

    private static StorageService storage;
    private static Scanner cin = new Scanner(System.in);
    public static void create(){
        String type;
        System.out.println("Comand received: create");
        System.out.println("Enter type of person: ");
        type = cin.nextLine().toString();
    }
    public static void read(){
        String type;
        System.out.println("Comand received: create");
        System.out.println("Enter type of person: ");
        type = cin.nextLine().toString();
        if(type == "student"){

            storage.addStudent();
        }else{
            storage.addProfessor();
        }
    }
    public static void update(){
        String type;
        System.out.println("Comand received: create");
        System.out.println("Enter type of person: ");
        type = cin.nextLine().toString();
        if(type == "student"){

            storage.addStudent();
        }else{
            storage.addProfessor();
        }
    }
    public static void delete(){
        String type;
        System.out.println("Comand received: create");
        System.out.println("Enter type of person: ");
        type = cin.nextLine().toString();
        if(type == "student"){

            storage.addStudent();
        }else{
            storage.addProfessor();
        }
    }

    public static void main(String[] args) {

    }

}