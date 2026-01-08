package com.university;
import java.util.ArrayList;
import java.util.List;
        
//Subclass 1
class Student_ extends Student{
    // Attributes
    private double gpa;
    private int maxCredits;
    private List<Course> registeredCourses; // Composition: Student has Courses
    
    //Mutator constructor
    public Student_(String name, String id, String email, double gpa) {
        super(name, id, email); // Calls parent constructor
        this.gpa = gpa;
        this.maxCredits = 20; // Default limit
        this.registeredCourses = new ArrayList<>();
    }
    
    // Method 1: Enroll with Validation 
    public void enroll(Course course) {
        // Validation 1: Course Capacity
        if (course.isFull()) {
            System.out.println("Failed to enroll " + getName() + " in " + course.getTitle() + ": Course is Full.");
            return;
        }

        // Validation 2: Prerequisites
        if (course.getPrerequisite() != null) {
            if (!registeredCourses.contains(course.getPrerequisite())) {
                System.out.println("Failed to enroll " + getName() + " in " + course.getTitle() + 
                                   ": Prerequisite " + course.getPrerequisite().getTitle() + " not completed.");
                return;
            }
        }

        // Success logic
        if (course.enrollStudent()) {
            registeredCourses.add(course);
            System.out.println("Success: " + getName() + " enrolled in " + course.getTitle());
        }
    }
    
    // Method 2: Drop Course
    public void drop(Course course) {
        if (registeredCourses.remove(course)) {
            course.dropStudent();
            System.out.println(getName() + " dropped " + course.getTitle());
        } else {
            System.out.println("Error: Student is not enrolled in this course.");
        }
    }

    // Method 3: Display Registered Courses
    public void displaySchedule() {
        System.out.println("\n--- Schedule for " + getName() + " ---");
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            for (Course c : registeredCourses) {
                System.out.println(c.toString());
            }
        }
        System.out.println("----------------------------------");
    }
    
    //Override method
    @Override
    public String toString(){
        return super.toString() +" | GPA: " + gpa + "| Role: Student";
    }
}
