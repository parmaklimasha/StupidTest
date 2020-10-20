package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    private String readProp(String name) {
        FileInputStream fileInputStream;
        Properties prop = new Properties();

        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
            return prop.getProperty(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(name);
    }

    public String getUrl() {
        return readProp("url");
    }

    public String getBrowser() {
        return readProp("browser");
    }

    public String getLogin() {
        return readProp("login");
    }

    public String getPassword() {
        return readProp("password");

    }

}
