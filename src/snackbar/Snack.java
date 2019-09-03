package snackbar;

public class Snack {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    //constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }


    //meathods
    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }
    // public void setQuantity(int quantity) {
    //     this.quantity = quantity;
    // }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    public int getVendingMachineId(){
        return vendingMachineId;
    }
    public void setVendingMachineId(){
        this.vendingMachineId = vendingMachineId;
    }

    //regular meathods
    public void totalCost(int){

    }

    public void buySnack(int quantity){
        this.quantity -= quantity;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
}