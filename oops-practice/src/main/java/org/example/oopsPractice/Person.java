package org.example.oopsPractice;
//Encapsulate Personal Information
//Create a Person class with private fields such as name, age, and address.
// Provide public getter and setter methods to access and modify these fields.
public class Person {
    private String name;
    private int age;
    private String address;
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
