package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String courseName;
    private int courseCredits;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, int courseCredits, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int courseCredits, Teacher instructor) {
        this(courseName, courseCredits, instructor, null);
    }

    public Course(String courseName, int courseCredits) {
        this(courseName, courseCredits, null, null);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int aCourseCredits) {
        courseCredits = aCourseCredits;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher aInstructor) {
        instructor = aInstructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> aEnrolledStudents) {
        enrolledStudents = aEnrolledStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseName.equals(course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName);
    }

    @Override
    public String toString() {
        return courseName + " (" + courseCredits + ") | Instructor: " + instructor;
    }
}
