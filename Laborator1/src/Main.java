import javax.swing.*;
import java.util.*;
 public class Main {
    public static void divizibile(int numar) {
        int i;
        for (i = numar; i < 99; i++) {
            if (i % numar == 0) {
                System.out.print(i+", ");
            }
        }
        if(99%numar == 0){
            System.out.println(i);
        }

    }
     public static void compare(Integer a, Integer b, Integer c) {
         if (a.compareTo(b) >= 0) {
             if (b.compareTo(c) >= 0) {
                 System.out.println(a + " <= " + b + " <= " + c);
             } else {
                 if (a.compareTo(c) >= 0) {
                     System.out.println(c + " <= " + a + " <= " + b);
                 } else {
                     System.out.println(a + " <= " + c + " <= " + b);
                 }
             }
         } else {
             if (b.compareTo(c) >= 0) {
                 if (c.compareTo(a) >= 0) {
                     System.out.println(b + " <= " + c + " <= " + a);
                 } else {
                     System.out.println(b + " <= " + a + " <= " + c);
                 }
             } else {
                 System.out.println(c + " <= " + b + " <= " + a);
             }
         }
     }

     public static int Fibonnacci(int poz){

        if(poz <=0 ) return 0;
        if(poz == 1 || poz == 2) return 1;

        return Fibonnacci(poz-1) + Fibonnacci(poz-2);



    }

    public static void main(String[] args) {
    //sout pentru System.out.prinln();

        //Integer a = Integer.MIN_VALUE;
        Integer obj = Integer.valueOf(1);
        /// exista clasa care infasoara practic primitivele si le da anumite functii
        
        System.out.println(obj);
        //parsare
        int parsare = Integer.parseInt("2");
     //   System.out.println(parsare);

        //citire de la tastatura
       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Integer nu = Integer.valueOf(10);
        System.out.println(nu.compareTo(x));
        */
        Scanner cin = new Scanner(System.in);
        System.out.println("Citim n: ");
        int n = cin.nextInt();
        System.out.println("1.Numerele divizibile cu "+n+" din intervalul [1,99]");
        divizibile(n);
        System.out.println("Citim n: ");
        n = cin.nextInt();
        System.out.println("3. Al "+n+" elea numar din sirul Fibonacci.");
        System.out.println(Fibonnacci(n-1));
        int a,b,c;
        System.out.println("Citim a:");
        a=cin.nextInt();

        System.out.println("Citim b:");
        b=cin.nextInt();

        System.out.println("Citim c:");
        c=cin.nextInt();

        compare(a,b,c);
    }


}