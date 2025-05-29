package lambda;

@FunctionalInterface
interface MyFcn  {
     void myMethode();
}

public class LambdaTypeConversionEx01 {
    public static void main(String[] args) {
        MyFcn f = ()-> {};
        Object obj = (MyFcn) (()->{});
        String str = ((Object) (MyFcn)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        //System.out.println(()->{});
        System.out.println((MyFcn) ()->{});
        //System.out.println((MyFcn) (()->{}).toString()); // Lambda expression not expected here (람다가 예측할 수 없음)
        System.out.println(((Object) (MyFcn) (()->{})).toString());

        /**
         * 일반적인 익명 객체 출력: 외부클래스이름$번호
         * 람다식 타입 객체의 출력 값: 외부클래스이름$람다$번호
        Lambda.LambdaTypeConversionEx01$$Lambda$14/0x0000007001001408@1c20c684
        Lambda.LambdaTypeConversionEx01$$Lambda$15/0x0000007001001628@1fb3ebeb
        Lambda.LambdaTypeConversionEx01$$Lambda$16/0x0000007001001848@31befd9f
        Lambda.LambdaTypeConversionEx01$$Lambda$17/0x0000007001001a68@1218025c
        Lambda.LambdaTypeConversionEx01$$Lambda$18/0x0000007001001c88@87aac27
         **/

        //
    }
}
