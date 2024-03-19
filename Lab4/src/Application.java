import CalculArii.*;
import ShoppingMall.*;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Shop();
    }
    public static void InterfataEx(){

        int raza,lungime,latime;

        System.out.println("Raza:");
        raza = cin.nextInt();

        System.out.println("Lungime:");
        lungime = cin.nextInt();

        System.out.println("Latime:");
        latime = cin.nextInt();

        Cerc cerc = new Cerc(raza);
        Patrulater patrat = new Patrulater(lungime,latime);
        System.out.println(cerc.calculPerimetru());
        System.out.println(patrat.calculPerimetru());

    }

    public static void Shop(){
        CreditCard creditCard = new CreditCard("Darius");
        DebitCard debitCard = new DebitCard("Darius",1000);
        ShoppingMall mall = new ShoppingMall();
        System.out.println("Cat costa produsul?");
        int valoare = cin.nextInt();
        cin.nextLine();
        System.out.println("Ce card doriti sa folositi?");

        String ce = cin.nextLine();
        ce = ce.toLowerCase();
        if(ce.equals( "credit")){
            mall.setCard(creditCard);
        }else{
         mall.setCard(debitCard);
        }

        mall.achizitie(valoare);

    }
 }
