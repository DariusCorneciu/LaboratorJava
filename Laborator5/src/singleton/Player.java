package singleton;

public class Player {

    private String firstName;
    private String lastName;
    private int gold;
    private int health;
    private int armor;
    private static Player instance;

    private Player(){
        this.health = 100;
        this.armor = 0;
        this.gold =100;
    }
    public static Player getInstance(){
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public boolean GiveGold(int suma){
        if(gold - suma < 0){
            System.out.println("Nu ai suficienti bani");
            return false;

        }else{

            System.out.println("Ti-am luat suma de: "+suma);
            gold = gold-suma;
            return true;
        }
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
    public int getGold() {
        return gold;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
