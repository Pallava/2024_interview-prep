package org.example.model;

public class Student {
    // Properties
    private String name;
    private int age;
    private int grade;
    private String studentID;
    private String gender;
    private String major;

    // Constructor
    public Student(String name, int age, int grade, String studentID, String gender, String major) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentID = studentID;
        this.gender = gender;
        this.major = major;
    }

    public Student() {
        System.out.println("creating new student");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", studentID='" + studentID + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
