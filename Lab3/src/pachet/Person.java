package pachet;

public class Person {

    private String name;
    private String phonenumber;
    private String email;


   public Person(){
       this("Joe Doe","0700000000","email@email.com");
   }
    public Person(String name,String phonenumber,String email){
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

}
