package snackBarProject;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private  int vendingMachineId;

    public Snack (String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity+=quantity;
    }

    public void buyQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public double getTotalCost(int quantity) {
        return cost * quantity;
    }

}
