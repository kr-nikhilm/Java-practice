package OOPs;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog says:Bow Bow");
    }
}

class Pig extends Animal {
    public void sound() {
        System.out.println("Pig says:wee wee");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal pig = new Pig();

        animal.sound();
        dog.sound();
        pig.sound();
    }

}
