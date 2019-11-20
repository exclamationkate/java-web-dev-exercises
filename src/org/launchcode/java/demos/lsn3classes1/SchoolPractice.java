package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student firstStudent = new Student("Kate Steib", 1, 1, 4.0);

        System.out.println(firstStudent.toString() + " " + firstStudent.getGradeLevel());
        firstStudent.addGrade(1,3.0);
        System.out.println(firstStudent.toString());
    }
}
