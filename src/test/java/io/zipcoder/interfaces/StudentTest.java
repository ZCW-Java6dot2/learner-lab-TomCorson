package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testImplementation(){
        Student student = new Student("Bob");
        boolean expected = true;
        boolean actual = student instanceof Learner ? true:false;
        assertEquals(expected,actual);
    }
    @Test
    public void testInheritance(){
        Student student = new Student("Bob");
        boolean expected = true;
        boolean actual = student instanceof Person ? true:false;
        assertEquals(expected,actual);
    }
    @Test
    public void testLearn(){
        Student student = new Student("Bob");
        student.learn(5.5);
        student.learn(3.0);
        Double expected = 8.5;
        Double actual = student.getTotalStudyTime();
        assertEquals(expected,actual);
    }

}