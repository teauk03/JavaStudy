package ExceptionHandling;

public class TryCatchEx03 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // ArithmeticException 발생
            System.out.println("catch 문으로 이동");
        } catch (ArithmeticException e) {
            e.printStackTrace(); // 예외발생 당시에 call stack에 있는 메서드의 정보와 예외 메세지를 출력해주는 메서드
            System.out.println("예외 메세지: " + e.getMessage());
        }

    }
}
