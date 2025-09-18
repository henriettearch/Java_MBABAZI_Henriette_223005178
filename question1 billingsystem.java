import java.util.Scanner;

public class SupermarketBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of different items bought: ");
        int itemCount = scanner.nextInt();

        String[] itemNames = new String[itemCount];
        double[] prices = new double[itemCount];
        int[] quantities = new int[itemCount];
        double[] subtotals = new double[itemCount];

        double totalBill = 0;

        for (int i = 0; i < itemCount; i++) {
            System.out.println("\nItem " + (i + 1) + ":");

            System.out.print("Enter item name: ");
            itemNames[i] = scanner.next();

            System.out.print("Enter price per unit: ");
            prices[i] = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            quantities[i] = scanner.nextInt();

            subtotals[i] = prices[i] * quantities[i];
            totalBill += subtotals[i];
        }

        double discount = 0;
        if (totalBill > 50000) {
            discount = totalBill * 0.05;
        }
        double finalAmount = totalBill - discount;

        // 6. Print receipt
        System.out.println("\n--- Supermarket Receipt ---");
        System.out.println("Item           Qty        Price/Unit      Subtotal");
		        for (int i = 0; i < itemCount; i++) {
		            System.out.println(itemNames[i] + "        " 
		                               + quantities[i] + "        " 
		                               + prices[i] + "        " 
		                               + subtotals[i]);
		        }

		        System.out.println("-------------------------------------------");
		        System.out.println("Grand Total (before discount): " + totalBill);
		        System.out.println("Discount: " + discount);
		        System.out.println("Final Amount Payable: " + finalAmount);

        scanner.close();
    }
}
