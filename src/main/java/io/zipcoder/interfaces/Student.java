package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime = 0.0;

    public Student(String name) {

        super(name);
    }

    public void learn(Double numOfHours) {
    this.totalStudyTime = this.totalStudyTime + numOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
