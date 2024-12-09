package Generices;
// Fruit1, Apple1, Grape1 클래스는 앞선 GenericeEx02 에 정의 되어 있음
class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }

}
class Juicer {
//    static Juice makeJuice(FruitBox<? extends Fruit1> box) {
//        String tmp = " ";
//
//        for (Fruit1 f : box.getList()) {
//            tmp += f + " ";
//        } return new Juice(tmp);
//    }
        // 제네릭 메서드로 구현
        static <T extends Fruit1> Juice makeJuice(FruitBox<T> box) {
            String tmp = " ";
        for (Fruit1 f : box.getList()) {
            tmp += f + " ";
        } return new Juice(tmp);

    }
}

public class GenericesEx03 {
    public static void main(String[] args) {
        FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();
        FruitBox<Apple1> appleBox = new FruitBox<Apple1>();

        fruitBox.add(new Apple1());
        fruitBox.add(new Grape1());

        appleBox.add(new Apple1());
        //  appleBox.add(new Grape1());

        System.out.println("과일 상자에 담긴 주스들의 과일: " + Juicer.<Fruit1>makeJuice(fruitBox)); // Fruit1 생량 가능 (컴파일러가 추정 가능한 영역)
        System.out.println("사과 상자에 담긴 주스들의 과일: " + Juicer.<Apple1>makeJuice(appleBox)); // Apple1 생량 가능 (컴파일러가 추정 가능한 영역)
    }
}
