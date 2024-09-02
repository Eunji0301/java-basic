package day7.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.meow();
        c1.breathe();
    }
}

class Animal {
    public void breathe() {
        System.out.println("숨쉬다.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍");
    }

//    // 중복
//    public void breathe() {
//        System.out.println("숨쉬다.");
//    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("야옹");
    }

//    // 중복
//    public void breathe() {
//        System.out.println("숨쉬다.");
//    }
}