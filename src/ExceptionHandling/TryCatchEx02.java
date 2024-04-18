package ExceptionHandling;

public class TryCatchEx02 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println("실행이 되지 않음");
        } catch (ArithmeticException e1) {
            if (e1 instanceof ArithmeticException){
                System.out.println(4);
            }
            System.out.println("ArithmeticException");
        }
        catch (Exception e) { // 모든 예외처리 가능
            System.out.println("Exception");
        }
        System.out.println("프로그램 종료");
    }
}
