package ShoppingMall;

import java.util.Scanner;

public class ShoppingMall {
    BankCard card;
    public void achizitie(double amount){
        card.doTransaction(amount);
    }

    public void setCard(BankCard card) {
        this.card = card;
    }
}
