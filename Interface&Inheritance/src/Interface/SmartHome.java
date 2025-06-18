package Interface;
import java.util.*;

interface SmartDevice {
    void turnOn();
    void turnOff();
    void status();
}

// SmartLight implementation
class SmartLight implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("SmartLight is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("SmartLight is now OFF.");
    }

    public void status() {
        System.out.println("SmartLight is " + (isOn ? "ON" : "OFF") + ".");
    }
}

// SmartFan implementation
class SmartFan implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("SmartFan is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("SmartFan is now OFF.");
    }

    public void status() {
        System.out.println("SmartFan is " + (isOn ? "ON" : "OFF") + ".");
    }
}
public class SmartHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Choose device
        System.out.print("Choose device (SmartLight/SmartFan): ");
        String deviceChoice = scanner.nextLine().trim();

        // Create appropriate device instance
        SmartDevice device;
        if (deviceChoice.equalsIgnoreCase("SmartLight")) {
            device = new SmartLight();
        } else if (deviceChoice.equalsIgnoreCase("SmartFan")) {
            device = new SmartFan();
        } else {
            System.out.println("Invalid device choice.");
            scanner.close();
            return;
        }

        // Action on the device
        System.out.print("Action (Turn On/Turn Off/Status): ");
        String action = scanner.nextLine().trim().toLowerCase();

        switch (action) {
            case "turn on":
                device.turnOn();
                break;
            case "turn off":
                device.turnOff();
                break;
            case "status":
                device.status();
                break;
            default:
                System.out.println("Invalid action.");
        }

        scanner.close();

	}

}
