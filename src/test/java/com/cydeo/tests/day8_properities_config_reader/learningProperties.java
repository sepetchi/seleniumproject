package com.cydeo.tests.day8_properities_config_reader;

import org.testng.annotations.Test;

public class learningProperties {

    @Test
    //key = value
    //os.name = mac OS x
    //user.name = ...
    public void java_properities_reading_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
