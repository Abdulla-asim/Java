public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("001", "Cookies Snack Packs(12)", 237, 350);
        Invoice inv2 = new Invoice("002", "Cup Cake", 20, 50);

        inv1.setpID("0011");

        inv2.setpQty(-50);
        inv2.setPricePerItem(60);
        inv2.setpDesc("Vanilla Cup Cake");
        inv2.setpID("0021");

        System.out.println("The invoice amount for invoice " + inv1.pID + " " + inv1.getpDesc() + " having quantity " 
        + inv1.pQty + " with a price per item  of " + inv1.getPricePerItem() + " is: " + inv1.getInvoiceAmount());
        System.out.println("");
       
        System.out.println("The invoice amount for invoice " + inv2.pID + " " + inv2.getpDesc() + " having quantity " 
        + inv2.pQty + " with a price per item  of " + inv2.getPricePerItem() + " is: " + inv2.getInvoiceAmount());
        System.out.println("");

    }
}
