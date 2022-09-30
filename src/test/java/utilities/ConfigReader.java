package utilities;

import jdk.dynalink.beans.StaticClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {  //Her methoddan önce çalışması için static bloğuna aldık
        String filePath = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fis);  // fis'in okuduğu bilgileri properties'e yükledi
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key) {
        /*
        Test methodundan yolladigimiz String key degerini alip properties classindan
        getProperty() methodunu kullanarak bu key'e ait value'yu bize getirir
        */
        return properties.getProperty(key);
    }
}
