package OOPSProblemJava;

abstract class Animal {
    private String name;

    public Animal(String name) { 
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows.");
    }
}

public class AbstractAnimalExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound(); // Output: Buddy barks.
        cat.makeSound(); // Output: Whiskers meows.
    }
}

/*In this example:

The Animal class is an abstract class with a constructor that initializes the name of the
animal and a method makeSound() which is declared as abstract.
The Dog and Cat classes extend the Animal class and provide concrete implementations of the makeSound() method.
The main method demonstrates how to create instances of Dog and Cat and call their makeSound() methods.
This example showcases the use of an abstract method makeSound() in an abstract class Animal,
and how subclasses are required to implement this method. */