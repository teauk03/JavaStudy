package Generices;

import java.util.ArrayList;

interface Eatable {  }

class Box1<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}
    public String toString() {
        return list.toString();
    }
}

class FruitBox<T extends Fruit1 & Eatable> extends Box1<T> { } // 제네릭 타입에 extends 키워드를 넣으면 뒤에 오는 클래스의 자손들만 담길 수 있음

class Fruit1 implements Eatable{
    public String toString() {return "Fruit";}
}
class Apple1 extends Fruit1 {
    public String toString() {return "Apple";}
}
class Grape1 extends Fruit1 {
    public String toString() {return "Grape";}
}
class Toy1 {
    public String toString() {return "Toy";}
}
public class GenericesEx02 {
    public static void main(String[] args) {
        FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();
        fruitBox.add(new Fruit1());
        fruitBox.add(new Grape1());
        fruitBox.add(new Apple1());
//        fruitBox.add(new Toy1()); // 담길 수 없음 Toy1은 Fruit1 클래스의 상속을 받지 못함



        FruitBox<Apple1> appleBox = new FruitBox<Apple1>();
        appleBox.add(new Apple1());
        // Required type: Apple
        // Provided:Fruit
//        appleBox.add(new Fruit());


        FruitBox<Grape1> grapeBox = new FruitBox<Grape1>();
        grapeBox.add(new Grape1());

        Box1<Toy1> toyBox = new Box1<Toy1>();
        toyBox.add(new Toy1());


        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println(toyBox);
    }
}
