package ShoppingMall;

public record DebitCard(String name,double limitAmount) implements BankCard {
    private static double spentAmount=0;
    @Override
    public void doTransaction(double amount){

        if((spentAmount+amount) >= limitAmount){
            System.out.println("Fonduri insuficiente!");
        }else{
            System.out.println("Utilizator " + name + " a cheltuit " + amount);
            spentAmount+= amount;
            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);

        }

    }
}
