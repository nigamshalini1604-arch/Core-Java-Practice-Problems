package org.example.oopsPractice;

public class PersonMain {
    public static void main(String ...args){
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main St, Anytown, USA");
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
