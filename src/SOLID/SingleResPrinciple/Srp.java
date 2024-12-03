package SOLID.SingleResPrinciple;

public class Srp {
    public static void main(String[] args) {
        OrderDepertment od = new OrderDepertment();
        od.addProduct(1);
        od.addProduct(2);
        od.addProduct(3);

        AccountDepertment ac = new AccountDepertment();
        ac.printinvoicee(od.getProducts());
    }
}
