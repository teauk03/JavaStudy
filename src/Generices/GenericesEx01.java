package generices;

import java.util.ArrayList;

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    int size() {return list.size();}
    public String toString() {
        return list.toString();
    }
}
class Fruit  {
    public String toString() {return "Fruit";}
}
class Apple extends Fruit {
    public String toString() {return "Apple";}
}
class Grape extends Fruit {
    public String toString() {return "Grape";}
}
class Toy {
    public String toString() {return "Toy";}
}

public class GenericesEx01 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        fruitBox.add(new Apple());
        fruitBox.add(new Fruit());
        fruitBox.add(new Grape());


        Box<Apple> appleBox = new Box<Apple>();
        appleBox.add(new Apple());
        // Required type: Apple
        // Provided:Fruit
//        appleBox.add(new Fruit());


        Box<Grape> grapeBox = new Box<Grape>();
        grapeBox.add(new Grape());
        // Required type: Grape
        // Provided:Fruit
//        grapeBox.add(new Fruit());

        Box<Toy> toyBox = new Box<Toy>();
        toyBox.add(new Toy());
        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println(toyBox);
    }
}
