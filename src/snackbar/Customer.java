package snackbar;

public class Customer{
    private static int maxId = 0;

    private String name;
    private double cash;

    //constructor
    public Customer(String name, double cash){
        maxId++;
        this.name = name;
        this.cash = cash;
    }

    //meathods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getCash(){
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
}