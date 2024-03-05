package Inheritance.SuperValue;

public class SuperValue01 {
    public static void main(String[] args) {
        LowerClass print01 = new LowerClass();
        print01.PrintMethod01();
    }
}

class UpperClass {
    int x = 10;
    int y = 20;

}
class LowerClass extends UpperClass{

    void PrintMethod01() {
        System.out.println("x = " + x);  // Upper 클래스의 x 값인 10을 출력
        System.out.println("this.x = " + this.x); // Upper 클래스의 x 값인 10을 출력
        System.out.println("this.y = " + this.y);  // Upper 클래스의 y 값인 20을 출력
        System.out.println("==================== 구분선 ====================");
        System.out.println("super.x = " + super.x); // Upper 클래스의 x 값인 10을 츨력
        System.out.println("super.y = " + super.y); // Upper 클래스의 y 값인 30을 출력
    }
}
// 조상에만 멤버가 존재히고 객체를 생성하면, print01이라는 객체가 생성되고, 멤버에는 int x = 10; int y= 20, PrintMethod01이라는 메서드가 존재하게 된다.
// 이떄의 18번줄의 x는 조상의 x이며 중복되지 않는 값이 아닐 경우 조상의 멤버를 가져와 사용할 수 있다.
// 그렇기에 super.x 와 this.x 의 주소가 같은 값을 가르킨다.