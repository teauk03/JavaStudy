package Inheritance.SuperValue;

public class SuperValue {
    public static void main(String[] args) {
        Lower print = new Lower();
        print.PrintMethod();
    }
}

class Upper {
    int x = 10;
    int y = 30;

}
class Lower extends Upper{
    int x = 20;
    int y = 10;
    void PrintMethod() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x); // Lower 클래스의 x 값인 20을 출력
        System.out.println("this.y = " + this.y);  // Lower 클래스의 y 값인 10을 출력
        System.out.println("==================== 구분선 ====================");
        System.out.println("super.x = " + super.x); // Upper 클래스의 x 값인 10을 츨력
        System.out.println("super.y = " + super.y); // Upper 클래스의 y 값인 30을 출력
    }
}
