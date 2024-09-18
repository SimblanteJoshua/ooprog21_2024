import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();

        double pricePerGuest = 35.0;
        double totalPrice = numGuests * pricePerGuest;

        System.out.println("\n* Carly's makes the food that makes\n* it a party.");

        System.out.println("\nNumber of guests: " + numGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);

        boolean isLargeEvent = numGuests >= 50;
        System.out.println("Is a large event: " + isLargeEvent);
    }
}
