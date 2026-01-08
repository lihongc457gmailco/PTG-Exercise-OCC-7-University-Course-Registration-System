package com.university;

//Main class
public class Registration {
    public static void main(String []args){
        System.out.println("=== University Course Registration System ===\n");
        
        //1.Object Creation
        //Create Couses
        Course cs101 = new Course("CS101", "Intro to Programming", 2);
        Course cs102 = new Course("CS102", "Data Structures", 30);
        Course cs201 = new Course("CS201", "Algorithms", 25);
        
        // Set Prerequisites (Challenge)
        cs102.setPrerequisite(cs101); // CS101 is required for CS102
        
        // Create Users (Polymorphism/Inheritance in action)
        Student_ student1 = new Student_("Alice Tan", "S001", "alice@uni.edu", 3.8);
        Student_ student2 = new Student_("Bob Lee", "S002", "bob@uni.edu", 3.2);
        Student_ student3 = new Student_("Charlie Lim", "S003", "char@uni.edu", 2.9);
        Instructor prof = new Instructor("Dr. Smith", "P001", "smith@uni.edu", "Computer Science");
        
        // Display Info (Uses toString)
        System.out.println(student1);
        System.out.println(prof);
        System.out.println();
        
        // 2. Demonstration of Features
        
        // Scenario A: Successful Enrollment
        System.out.println("--- Scenario A: Normal Enrollment ---");
        student1.enroll(cs101); // Success
        student2.enroll(cs101); // Success
        
        // Scenario B: Capacity Validation (CS101 capacity is 2, currently 2 enrolled)
        System.out.println("\n--- Scenario B: Capacity Validation ---");
        student3.enroll(cs101); // Should fail

        // Scenario C: Prerequisite Validation
        System.out.println("\n--- Scenario C: Prerequisite Check ---");
        // Alice has taken CS101, so she can take CS102
        student1.enroll(cs102); 
        // Bob has taken CS101, he can take CS102
        student2.enroll(cs102);
        // Charlie Failed CS101 enrollment, so he cannot take CS102
        student3.enroll(cs102); // Should fail due to prerequisite

        // Scenario D: Display and Drop
        student1.displaySchedule();
        student1.drop(cs102);
        student1.displaySchedule();
    }
}
