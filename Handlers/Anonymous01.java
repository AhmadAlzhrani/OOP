package Lecture20;

abstract class Animal {
    String name;
    Animal(String name){ this.name = name;}
    abstract void makeSound();
 }

class Dog {
    Animal inner = new Animal("Sue") {
        static final int id =10;
         @Override
         public void makeSound() {
            System.out.println(id+ " " + name + 
                    " is a Dog that makes Sound");
         }
      }; 
}


public class Anonymous01 {
    public static void main(String[] args) {
       Dog dogObj  = new Dog();
       dogObj.inner.makeSound();
    }   
}

