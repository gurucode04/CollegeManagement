package collectionMap;

import java.util.*;

public class ProductPriceMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> priceMap = new HashMap<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Product ID: ");
            int id = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            priceMap.put(id, price);
        }

        System.out.println("\nPrices:");
        for (Map.Entry<Integer, Double> entry : priceMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + " | Price: $" + entry.getValue());
        }

        sc.close();
    }
}
