package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testInstructorImplementation(){
        Instructor instructor = new Instructor("Mrs. Teacher");
        boolean expected = true;
        boolean actual = instructor instanceof Teacher ? true:false;
        assertEquals(expected,actual);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("Mrs. Teacher");
        boolean expected = true;
        boolean actual = instructor instanceof Person ? true:false;
        assertEquals(expected,actual);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor("Mrs. Teacher");
        Student student = new Student("Billy");
        instructor.teach(student,10.75);
        Double expected = 10.75;
        Double actual = student.getTotalStudyTime();
        assertEquals(expected,actual);
    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor("Mrs. Teacher");
        Student billy = new Student("Billy");
        Student sally = new Student("Sally");
        Student [] classroom = {billy,sally};

        instructor.lecture(classroom,50.00);
        Double expected = 25.00;
        Double actual = sally.getTotalStudyTime();
        assertEquals(expected,actual);
    }
}