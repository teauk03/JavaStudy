package Polymorphism.UpDownCasting;
class Phone {
    protected void 전화걸기기능(String name) {
        System.out.println(name+"은(는) 전화를 거는 중..");
    }
}
class IPhone extends Phone{
    protected void 인터넷접속기능(String name) {
        System.out.println(name + "는 인터넷에 접속할 수 있다.");
    }
    protected void 애플기기끼리연동기능(String name){
        System.out.println(name + "는 애플 기기 끼리 연동 됩니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Phone phone01 = new IPhone(); // 업 캐스팅
        // IPhone 클래스의 인스턴스를 Phone 클래스의 참조 변수에 할당
        phone01.전화걸기기능("폰"); // 가능
        // phone01.인터넷접속기능 // 불가능
        // phone01.애플기기끼리연동기능 // 불가능


        IPhone IPhone11ProMax = (IPhone) phone01; // 다운 캐스팅
        // Phone 클래스의 참조 변수인 phone01을 IPhone 클래스의 참조 변수인 IPhone11max에 할당
        IPhone11ProMax.전화걸기기능("아이폰 11 프로 맥스 ");
        IPhone11ProMax.애플기기끼리연동기능("아이폰 11 프로 맥스 ");
        IPhone11ProMax.인터넷접속기능("아이폰 11 프로 맥스");


    }
}
