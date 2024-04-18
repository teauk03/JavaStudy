package ExceptionHandling;

public class TryCatchEx01 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i=0; i<10; i++) {
            try {
                result = number / (int)(Math.random() * 10); // number 를 0에서 9 사이의 랜덤한 값으로 나누어 result 에 저장
                System.out.println(result);
            } catch (ArithmeticException e) { // 0으로 나누는 경우 발생하는 산술 예외(ArithmeticException)를 처리 --> 0 출력
                System.out.println("0");
            }
        }
    }
}
