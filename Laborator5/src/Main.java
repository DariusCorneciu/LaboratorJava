import exercitiuStringuri.*;
import singleton.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        Player player = Player.getInstance();
        boolean ingame = true;
        System.out.println("1. Vezi gold");
        System.out.println("2. Joaca la zaruri");
        System.out.println("3.Iesi din joc");
        while(ingame){
            int actiune = cin.nextInt();
            switch (actiune){
                case 1:
                    System.out.println("Gold: "+player.getGold());
                    break;
                case 2:
                    int betgod;
                    System.out.println("Cat vrei sa pariezi la zaruri?:");
                    betgod = cin.nextInt();
                    if(player.GiveGold(betgod)){
                        int pzaruri = (int) (Math.random() * 12) + 1;
                        int dzaruri = (int) (Math.random() * 12) + 1;
                        System.out.println(player.getFullName()+" dat cu zarurile: "+pzaruri);
                        System.out.println("Dealer-ul dat cu zarurile: "+dzaruri);
                        if(pzaruri > dzaruri){
                            System.out.println("Ai castigat suma de "+betgod*2);
                        }else{
                            System.out.println("Ai pierdut suma de "+betgod);
                        }

                    }
                    break;
                case 3:
                    System.out.println("Ai ales sa iesi din joc");
                    ingame = false;
                    break;
                default:
                    System.out.println("Acțiune invalidă");
            }
        }
    }

    public static void ExercitiiRegex(){
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

        System.out.println("Ex 4: "+exercitiu.reverse());

    }

}