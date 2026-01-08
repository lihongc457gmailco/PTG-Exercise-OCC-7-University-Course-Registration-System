package com.university;

//Independent class
public class Course {
    //Attributes
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolledCount;
    private Course prerequisite; //Composition: Course has a prerequisite Course
    
    //Mutator Constructor
    public Course(String courseCode, String title, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        this.enrolledCount = 0;
        this.prerequisite = null;
    }
    
    //Methods
    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }
    public boolean isFull() {
        return enrolledCount >= capacity;
    }
    public boolean enrollStudent() {
        if (!isFull()) {
            enrolledCount++;
            return true;
        }
        return false;
    }
    public void dropStudent() {
        if (enrolledCount > 0) {
            enrolledCount--;
        }
    }
    public String getCourseCode() { 
        return courseCode; 
    }
    public String getTitle() { 
        return title; 
    }
    public Course getPrerequisite() { 
        return prerequisite; 
    }
    
    //Override method
    @Override
    public String toString() {
        return courseCode + ": " + title + " (" + enrolledCount + "/" + capacity + ")";
    }
}
