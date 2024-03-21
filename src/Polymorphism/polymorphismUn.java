package Polymorphism;

import java.util.ArrayList;

// 다형성 예시 코드 (동물)
class Animal {
    String name = "동물";
    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(this.name + "은 소리를 냅니다.");
    }
    void move() {
        System.out.println(this.name + "은 움직입니다.");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name+ "라는 개가 멍멍 소리를 냅니다."); // 상위 클래스
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + "가 야옹 소리를 냅니다.");
    }
}
public class polymorphismUn {
    public static void main(String[] args) {
        Animal Allanimal = new Animal("모든 동물");
        Animal CoCo = new Dog("코코");
        Animal Cat = new Cat("고양이");
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(Allanimal);
        animalList.add(CoCo);
        animalList.add(Cat);

        for (Animal ani : animalList) {
            ani.makeSound();
            ani.move();
        }

    }
}
