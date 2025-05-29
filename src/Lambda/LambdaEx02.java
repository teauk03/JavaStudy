package lambda;

// interface MyFcn {
//  void myMethode;
//}


class Outher {
    int val = 10;

    class Inner {
        int val = 20;
        void method(int i) {  // i=100
            {
                int val = 30; // final int val = 30;
                // i = 10; // -- 상수 i의 값을 변경할 수 없음
                MyFcn f = () -> {
                    System.out.println("i: " + i); // 100
                    System.out.println("val: " + val); //  method 안에 있는 지역변수 val 출력
                    System.out.println("this.val: " + this.val); // Outher.Inner 클래스의 인스턴스 변수 val 출력
                    System.out.println("Other.this.val: " + Outher.this.val); // Outher 클래스의 인스턴스 변수 val 출력
                };
                f.myMethode();
            }
        }
    }
}

public class LambdaEx02 {
    public static void main(String[] args) {
        Outher outher = new Outher();
        Outher.Inner inner = outher.new Inner();
        inner.method(100);
    }

}

