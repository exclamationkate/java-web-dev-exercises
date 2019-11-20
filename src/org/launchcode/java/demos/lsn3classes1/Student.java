package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // Transfer student constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    // Constructor for new student
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    // Instance Methods
    public void addGrade(int courseCredits, double grade) {
        double currentQualityScore = gpa * numberOfCredits;
        double totalQualityScore = currentQualityScore + (grade * courseCredits);

        numberOfCredits += courseCredits;
        gpa = totalQualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        String gradeLevel;
        if (this.numberOfCredits >= 90) {
            gradeLevel = "Senior";
        } else if (this.numberOfCredits >= 60) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits >= 30) {
            gradeLevel = "Sophomore";
        } else {
            gradeLevel = "Freshman";
        }
        return gradeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return name + " [" + studentId + "]: (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }
}