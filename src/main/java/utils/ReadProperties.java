package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";
    public static String url;
    public static String browser;

    static {
        FileInputStream fileInputStream;
        Properties prop = new Properties();

        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);

            url = prop.getProperty("url");
            browser = prop.getProperty("browser");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
