public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Product 1", 20.43);
        payment.addItem("Product 2", 12.34);
        payment.addItem("Product 3", 54.32);

        payment.displayItems();
        System.out.println("Total price: $" + payment.getTotalPrice());
    } }
