package snackBarProject;

public class Main {

    private static void workWithData() {

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75,1);
        Snack s2 = new Snack("Chocolate Bar",36,1.00, 1);
        Snack s3 = new Snack("Pretzel",30,2.00,1);

        Snack s4 = new Snack("Soda", 24,2.50,2);
        Snack s5 = new Snack("Water", 20, 2.75,2);



        System.out.println("**** Query Data *** \n");

        c1.buy(s4.getTotalCost(3));
        s4.buyQuantity(3);
        System.out.println("Cash on Hand c1: " + c1.getCashOnHand());
        System.out.println("Quantity of s4: " + s4.getQuantity() + "\n");

        c1.buy(s3.getTotalCost(1));
        s3.buyQuantity(1);
        System.out.println("Cash on Hand c1: " + c1.getCashOnHand());
        System.out.println("Quantity of s3: " + s3.getQuantity() + "\n");

        c2.buy(s4.getTotalCost(2));
        s4.buyQuantity(2);
        System.out.println("Cash on Hand c2: " + c2.getCashOnHand());
        System.out.println("Quantity of s4: " + s4.getQuantity() + "\n");

        c1.addCash(10.00);
        System.out.println("c1 found $10: " + c1.getCashOnHand() + "\n");

        c1.buy(s2.getTotalCost(1));
        s2.buyQuantity(1);
        System.out.println("Cash on Hand c1: " + c1.getCashOnHand());
        System.out.println("Quantity of s2: " + s2.getQuantity() + "\n");

        s3.addQuantity(12);
        System.out.println("s3 added 12: " + s3.getQuantity() + "\n");

        c2.buy(s3.getTotalCost(3));
        s3.buyQuantity(3);
        System.out.println("Cash on Hand c2: " + c2.getCashOnHand());
        System.out.println("Quantity of s3: " + s3.getQuantity() + "\n");

        System.out.println("*** Finish ***");
    }



    public static void main(String[] args) {
	workWithData();
    }
}
