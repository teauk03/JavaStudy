package Polymorphism;
// 다형성 예시 코드 (동물)
class Animal {
    static String name = "동물";
    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + "라는 동물은 소리를 냅니다.");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name+ "가 멍멍 소리를 냅니다."); // 상위 클래스
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}
public class polymorphismUn {
    public static void main(String[] args) {
        Animal CoCo = new Dog("코코"); // 상위 클래스인 Animal 클래스의 타입의 변수에 할당
        Animal Cat = new Cat("고양이"); // 상위 클래스인 Animal 클래스의 타입의 변수에 할당
        CoCo.makeSound(); // 상위 클래스인 Animal 클래스의 타입의 변수에 할당하여도 오버라이딩한 메서드가 있기에 Dog안에 있는 메서드가 실행된다.
        Cat.makeSound(); //  상위 클래스에 정의 되어 있는 makeSound() 메서드가 실행된다.
    }
}
