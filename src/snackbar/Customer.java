package snackbar;

public class Customer{
    private static int maxId = 0;

    private String name;
    private double cash;

    //constructor
    public Customer(String name, double cash){
        maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //meathods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getcashOnHand(){
        return cashOnHand;
    }
    
    public void addCashOnHand(double cash) {
        this.cashOnHand += cash;
    }
    
    public void buySnack(int quantity, Snack snack){
        snack.buySnack(quantity);
        this.cashOnHand -= snack.getCost(quantity);
    }
}