package com.university;

//Base class
public class Student {
    //attributes
    //Encapsulation (private variables)
    protected String name;
    protected String id;
    protected String email;
    
    //Mutator accessor
    public Student(String name,String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }
    
    //Methods
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    
    //Override method
    @Override
    public String toString(){
        return "ID: " + id + " Name: " + name + " | Email: " + email;
    }
}
