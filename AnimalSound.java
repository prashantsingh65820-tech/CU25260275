class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class AnimalSoundTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}