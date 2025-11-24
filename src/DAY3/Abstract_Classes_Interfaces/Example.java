package DAY3.Abstract_Classes_Interfaces;

// ABSTRACT CLASSES IN JAVA
// A class wch can't be instantiated
// Use keyword abstract

// It contains Abstract Method and data
// It will force to implement the required methods
// It will also provide Partial Abstraction
// Eliminate duplicate code

abstract class Animal{

    abstract void sound();
    String name;
    Animal(String n){
        this.name=n;
    }

    void sleep(){
    System.out.println("Animals Making sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Example{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sleep();
        
    }
}

