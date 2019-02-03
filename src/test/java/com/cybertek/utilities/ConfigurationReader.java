package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        //this is the path to the location of the file
        String path = "configuration.properties";

        try {
            //reader for the file, java cannot read the files directly, it needs inputStream to read files
            //inputStream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            //Properties is used to read specifically Properties files, files with key value pairs.
            properties = new Properties();

            //files contents are load to properties from the inputStream
            properties.load(fileInputStream);

            //all input streams must be closed
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //returns the value of specific property
    public static String getProperty(String property) {

        return properties.getProperty(property);
    }
}
