package org.gradle.shared;

import java.io.IOException;
import java.util.Properties;

public class Person2 {
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String readProperty() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("org/gradle/shared/main.properties"));
        return properties.getProperty("main");
    }
}