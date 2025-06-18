package collectionMap;

import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> empMap = new TreeMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            empMap.put(id, name);
        }

        System.out.println("\nSorted Employee Records:");
        for (Map.Entry<Integer, String> entry : empMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }

        sc.close();
    }
}
