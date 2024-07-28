package singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();

        System.out.println(configManager1.getConfig());
        System.out.println(configManager1 == configManager2); // Should print true
    }
}
