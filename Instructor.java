package com.university;

//Sub class 2
class Instructor extends Student {
    //Attributes
    private String department;
    private double salary;
    private String officeHours;
    
    //Mutator constructor
    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        this.department = department;
        this.salary = 5000.00; // Default
        this.officeHours = "Mon-Wed 10am";
    }

    //Methods
    public void setOfficeHours(String hours) {
        this.officeHours = hours;
    }
    public String getDepartment() {
        return department;
    }

    //Override method
    @Override
    public String toString() {
        return super.toString() + " | Dept: " + department + " | Role: Instructor";
    }
    
}
