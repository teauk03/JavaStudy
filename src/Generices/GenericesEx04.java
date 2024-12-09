package Generices;

import java.util.*;

class Fruit2 {
    String name;
    int weight;
    Fruit2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name = "(" + weight + ")";
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

class AppleComp implements Comparator<Apple2> {
    public int compare(Apple2 t1, Grape2 t2) {
        return t2.weight - t1.weight;
    }
}

public class Generices04 {
    public static void main(String[] args) {

    }
}
