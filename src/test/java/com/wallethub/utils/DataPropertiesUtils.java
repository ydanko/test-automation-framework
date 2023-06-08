package com.wallethub.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataPropertiesUtils {

    public static String getDataProperties(String key) {
        FileInputStream fileInputStream;
        Properties property = new Properties();
        String host = null;
        String profilePage = null;
        String login = null;
        String password = null;
        try {
            fileInputStream = new FileInputStream("src/test/resources/config_credentials.properties");
            property.load(fileInputStream);
            host = property.getProperty("db.host");
            profilePage = property.getProperty("db.profile_page");
            login = property.getProperty("db.login");
            password = property.getProperty("db.password");
              } catch (IOException e) {
            e.printStackTrace();
        }
        return property.getProperty(key);
    }
}
