package exercitiuStringuri;

import java.util.List;

public class Regex {

    private String string;
    private String[] bagOfWords;


    public Regex(String string) {
        this.string = string;
        this.bagOfWords = string.split(" ");
    }

    public int Length(){
        return string.length();
    }

    public boolean OnlyLower(){
        String caps=string.replaceAll("[^a-zA-Z]", "");
        return caps.matches("[a-z]+");
    }

    public boolean OnlyCaps(){
        String low=string.replaceAll("[^a-zA-Z]", "");

        return low.matches("[A-Z]+");
    }
    //sa se imparta textul in cuvinte si sa se afiseze cuvintele de la mijloc

    public String middle(){
        int length =bagOfWords.length;
        length = length/2;
        if(string.length() %2 == 0){
            return bagOfWords[length-1] +" "+ bagOfWords[length];
        }else{
            return bagOfWords[length];
        }
    }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
