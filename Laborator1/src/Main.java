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
    public static void compare(int a,int b, int c){


    }
    public static int Fibonnacci(int poz){

        if(poz == 1 || poz == 2) return 1;

        return Fibonnacci(poz-1) + Fibonnacci(poz-2);



    }

    public static void main(String[] args) {
    //sout pentru System.out.prinln();

        Integer a = Integer.MIN_VALUE;
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
        System.out.println(Fibonnacci(n));


    }

}