import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes rented: ");
        int minutes = scanner.nextInt();

       
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

       
        double hourlyCost = hours * 40;
        double extraMinuteCost = remainingMinutes * 1;
        double totalCost = hourlyCost + extraMinuteCost;

      
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Total Cost: $" + totalCost);

        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
}
