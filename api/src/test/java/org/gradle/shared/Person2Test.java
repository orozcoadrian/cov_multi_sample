package org.gradle.shared;

//import static org.testng.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by ajo on 5/5/17.
 */
public class Person2Test {
    public void testTest() {
        Person person = new Person("testname1");
        assertEquals("testname1", person.getName());
        person.setName("testname2");
        assertEquals("testname2", person.getName());
    }
}