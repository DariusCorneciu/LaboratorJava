import exercitiuStringuri.*;
public class Main {

    public static void main(String[] args) {
        String string = "odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        Regex exercitiu = new Regex(string);

        System.out.println("Ex 1: "+exercitiu.Length());

        System.out.println("Ex 2: ");
        if(exercitiu.OnlyCaps()){
            System.out.println("Propozitia este formata doar din litere mari");
        }else{

            System.out.println("Propozitia nu este formata doar din litere mari");
        }
        if(exercitiu.OnlyLower()){
            System.out.println("Propozitia este formata doar din litere mici");
        }else{

            System.out.println("Propozitia nu este formata doar din litere mici");
        }

        System.out.println("Ex 3: "+exercitiu.middle());

    }

}