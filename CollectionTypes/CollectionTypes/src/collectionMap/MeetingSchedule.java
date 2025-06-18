package collectionMap;

import java.util.*;

public class MeetingSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> schedule = new TreeMap<>();

        System.out.print("Enter number of meetings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline after the integer input

        for (int i = 0; i < n; i++) {
            System.out.print("Enter time (HH:MM): ");
            String time = sc.nextLine();

            System.out.print("Enter meeting description: ");
            String desc = sc.nextLine();

            schedule.put(time, desc);
        }

        System.out.println("\nMeetings in time order:");
        for (Map.Entry<String, String> entry : schedule.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        sc.close();
    }
}
