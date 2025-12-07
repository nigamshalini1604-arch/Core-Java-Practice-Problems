package org.example.oopsPractice;

public class AnimalMain {
    public static void main(String...args){
        //concept of upcasting where reference variable is of parent class and object is of child class
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
        //concept of Downcasting is when you cast a superclass reference back to a subclass type.
        // Here dog is a superclass Animal reference pointing to a subclass Dog object.
        // Here we are using instanceof to avoid ClassCastException at runtime.
        //Dog dog1 = dog; // this will cause class cast exception
        if(dog instanceof Dog){
            Dog dog1 = (Dog) dog;
            dog1.sound();
        }
        if(cat instanceof Cat){
            Cat cat1 = (Cat) cat;
            cat1.sound();
        }

    }
}
