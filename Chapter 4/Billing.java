class Billing {

    public double computeBill(double price) {
        double tax = 0.08 * price;
        double totalPrice = tax + price;
        System.out.println("The total price for the bill is: $" + totalPrice);
        return totalPrice;
    }

    public double computeBill(double price, int quantity) {
        double total = price * quantity * 1.08;
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discAmount = (couponDiscount / 100.0) * subtotal;
        double total = (subtotal - discAmount) * 1.08;
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    public static void main(String[] args) {
        Billing billing = new Billing();

        billing.computeBill(23.2);
        billing.computeBill(23.2, 2);
        billing.computeBill(23.2, 3, 5);
    }
}
