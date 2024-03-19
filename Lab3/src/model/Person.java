package model;

public class Person {

    private String name;
    private String phoneNumber;
    private String email;


   public Person(){
       this("Joe Doe","0700000000","email@email.com");
   }
   public Person(Person copy){
    this(copy.name,copy.phoneNumber, copy.email);
   }

    public Person(String name,String phonenumber,String email){
        this.name = name;
        this.email = email;
        this.phoneNumber = phonenumber;
    }


    /// getter si setteri
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
