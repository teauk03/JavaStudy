package Abstract;
abstract class Animal {
    abstract void makeSound(); // 소리를 내는 추상 메서드
    abstract void Working(); // 움직이는 동작을 하는 추상 메서드
}
abstract class Dog extends Animal {

}
// 골든 리트리버 클래스에서 모든 추상 메서드를 구현한다.
class GoldenRetriever extends  Dog{
    String RetrieverName;
    int RetrieverAge;
    GoldenRetriever(int RetrieverAge, String RetrieverName) {
        this.RetrieverAge = RetrieverAge;
        this.RetrieverName = RetrieverName;
    }
//    public String getRetrieverName(String RetrieverAge){
//        return RetrieverAge;
//    }

    @Override
    void makeSound() {
        System.out.println("멍멍 소리를 내어 짖습니다.");
    }
    @Override
    void Working(){
        System.out.println(RetrieverName + "는 애교를 부리며 귀여운 행동을 합니다.");
    }

}

public class AnimalAbstract {
    public static void main(String[] args) {
        GoldenRetriever Reo = new GoldenRetriever(3, "레오");
        Reo.makeSound();
        Reo.Working();
        System.out.println(Reo.RetrieverName + "는 너무나도 영특합니다.");
    }
}
