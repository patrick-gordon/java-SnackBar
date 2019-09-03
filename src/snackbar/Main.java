package snackbar;

public class Main {

    public static void workWithData(){
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("office");

        Snack chips = new Snack("Chips", 36, 1.75, vm1.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, vm1.getId());
        Snack soda = new Snack("Soda", 24, 2.50, vm2.getId());
        Snack water = new Snack("Water", 20, 2.75, vm2.getId());

        jane.buySnack(4, soda);
        System.out.println("Janes cash on hand: " + jane.getCashOnHand());
        System.out.println(soda.getQuantity() + "Their are this many soda's remaining");
        
        jane.buySnack(1, pretzel);
        System.out.println("Janes cash on hand: " + jane.getCashOnHand());
        System.out.println(pretzel.getQuantity() + "Their are this many pretzels remaining");
        
        bob.buySnack(2, soda);
        System.out.println("Bob's cash on hand: " + bob.getCashOnHand());
        System.out.println(soda.getQuantity() + "Their are this many soda's remaining");

        jane.addCashOnHand(10);
        System.out.println(jane.getCashOnHand() + "Janes cash on hand");

        jane.buySnack(1, chocolate);
        System.out.println("Janes cash on hand: " + jane.getCashOnHand());
        System.out.println(chocolate.getQuantity() + "Their are this many chocolate's remaining");

        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity() + "Their are this many pretzels remaining");

        bob.buySnack(3, pretzel);
        System.out.println("Bob's cash on hand: " + bob.getCashOnHand());
        System.out.println(pretzel.getQuantity() + "Their are this many pretzels remaining");




    }

    public static void main(String[] args) {
        workWithData();
    }
}