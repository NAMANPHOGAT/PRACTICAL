package class2;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal a;   // Reference of parent class

        a = new Dog();
        a.sound();   // Output: Dog barks

        a = new Cat();
        a.sound();   // Output: Cat meows
    }
}


