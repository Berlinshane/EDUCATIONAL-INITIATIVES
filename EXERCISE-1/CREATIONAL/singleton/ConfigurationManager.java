package singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String config;

    private ConfigurationManager() {
        // Load the configuration from a file or any other source
        config = "Default Configuration";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }
}
