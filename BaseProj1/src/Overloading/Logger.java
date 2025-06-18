package Overloading;

public class Logger {

    public void log(String message) {
        System.out.println("[INFO] " + message);
    }

    public void log(String message, String level) {
        System.out.println("[" + level.toUpperCase() + "] " + message);
    }

    public void log(String message, String level, String user) {
        System.out.println("[" + level.toUpperCase() + "] " + message + " (User: " + user + ")");
    }

    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("System started successfully.");

        logger.log("Disk space running low.", "warning");

        logger.log("Unauthorized access attempt detected.", "error", "admin_user");
    }
}

