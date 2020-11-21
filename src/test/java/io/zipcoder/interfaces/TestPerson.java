package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void testPersonConstructor(){
        Person person = new Person("Wyatt");
        String expected = "Wyatt";
        String actual = person.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void testPersonGetter(){
        Person person = new Person("Bert");
        String expected = "Bert";
        String actual = person.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void testPersonSetter(){
        Person person = new Person("Bert");
        person.setName("Bertha");
        String expected = "Bertha";
        String actual = person.getName();
        assertEquals(expected, actual);
    }

}
