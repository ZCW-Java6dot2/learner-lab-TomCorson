package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(String name) {
        super(name);
    }

    public void teach(Student s, Double numOfHours) {
        s.learn(numOfHours);
    }

    public void lecture(Student[] s, Double numOfHours) {
        double numberOfHoursPerStudent = numOfHours / s.length;
        for(Student stu: s){
            stu.learn(numberOfHoursPerStudent);
        }
    }
}
