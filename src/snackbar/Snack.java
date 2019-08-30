package snackbar;

public class Snack {
    //fields
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;


    //meathods
    public int getId(){
        return id;
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
}