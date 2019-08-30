package snackbar;

public class VendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public VendingMachine(String name){
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    //meathods

    public int getId(){
        return id;
    }
    public setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}