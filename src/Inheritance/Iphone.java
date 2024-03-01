package Inheritance;
import java.util.*;
class SmartPhone {
    Scanner scanner = new Scanner(System.in);

    String PhoneNum;
    String PhoneModel;
    // 상위 클래스의 생성자
    public SmartPhone(String PhoneNum, String PhoneModel){
        this.PhoneNum = PhoneNum;
        this.PhoneModel = PhoneModel;
    }
    public void SmartPhoneFn1 () {
        System.out.println("스마트 폰으로는 전화를 걸 수 있습니다 통신을 시도할 전화번호를 입력하세요.");
        int UserPhoneNum = scanner.nextInt();
        System.out.println(UserPhoneNum + "번호로 전화를 시도합니다.");
    }
    public void SmartPhoneFn2() {
        System.out.println("스마트 폰으로는 웹 브라우저에 접속할 수 있습니다.");
        System.out.print("접속할 URL을 입력해주세요: ");
        String UserInputURL = scanner.nextLine();
        System.out.println(UserInputURL + "로 접속합니다.");
    }
}

public class Iphone extends SmartPhone{
    Iphone() {
        super("010-1234-1234", "아이폰15 PRO");
    }

    public static void main(String[] args) {
        Iphone MyIphone = new Iphone();
        System.out.println("나의 핸드폰 번호는: " + MyIphone.PhoneNum + "입니다.");
        System.out.println("나의 핸드폰 기종은: " + MyIphone.PhoneModel + "입니다.");
       // MyIphone.SmartPhoneFn1();
        MyIphone.SmartPhoneFn2();
    }

}
