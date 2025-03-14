package utils;

import interfaces.PathProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader implements PathProject {

    /**
     * @param key      from file .properties
     * @param fileName name of file properties
     * @return value from file .properties
     */
    public static String getProperty(String key, String fileName){
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/properties/"+fileName);
            properties.load(fileInputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
