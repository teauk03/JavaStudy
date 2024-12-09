package Generices;

import java.util.*;
// Box1 클래스는 GenericesEx02 클래스에 정의 되어 있음

class FruitBox2<T extends Fruit2> extends Box1<T> { }

class Fruit2 {
    String name;
    int weight;
    Fruit2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    // toString Override: 과일 이름과 무게를 출력
    @Override
    public String toString(){
        return name  + "(" + weight + ")";
    }
}
class Apple2 extends Fruit2{
    Apple2(String name,int weight){
        super(name, weight);
    }
}
class Grape2 extends  Fruit2 {
    Grape2(String name, int weight) {
        super(name, weight);
    }
}

class FruitComp implements Comparator<Fruit2> {
    public int compare(Fruit2 t1, Fruit2 t2) {
        return t1.weight - t1.weight;
    }
}

class AppleComp implements Comparator<Apple2> {
    public int compare(Apple2 t1, Apple2 t2) {
        return t2.weight - t1.weight;
    }
}
class GrapeComp implements Comparator<Grape2> {
    public int compare(Grape2 t1, Grape2 t2) {
        return t2.weight - t1.weight;
    }
}

public class GenericesEx04 {
    public static void main(String[] args) {
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();

        appleBox.add(new Apple2("초록 사과", 300));
        appleBox.add(new Apple2("초록 사과", 200));
        appleBox.add(new Apple2("빨간 사과", 100));

        grapeBox.add(new Grape2("청포도", 500));
        grapeBox.add(new Grape2("포도", 200));
        grapeBox.add(new Grape2("청포도", 300));
        grapeBox.add(new Grape2("포도", 400));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println();
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
