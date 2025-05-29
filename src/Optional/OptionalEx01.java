import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx01 {

    static int optStrToint(Optional<String> optStr, int defaultValue) {
        try {
            // Optional 내의 값을 Integer로 변환하고 반환
            return optStr.map(Integer::parseInt).get();
        } catch (Exception e) {
            // 예외가 발생하면 기본값 반환
            return defaultValue;
        }
    }

    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcdef");
        Optional<Integer> optInt = optStr.map(String::length);

        System.out.println("optStr: " + optStr.get());  // optStr: abcdef
        System.out.println("optInt: " + optInt.get());  // optInt: 6 (abcdef의 길이)

        // Optional을 사용하여 문자열을 정수로 변환하고, 조건을 만족하는 경우에만 값 처리
        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)  // 길이가 0보다 큰 경우에만
                .map(Integer::parseInt)  // Integer로 변환
                .get();  // 값이 존재하므로 get()으로 값을 추출

        int result2 = Optional.of("")  // 빈 문자열
                .filter(x -> x.length() > 0)  // 길이가 0보다 큰 경우
                .map(Integer::parseInt)  // Integer로 변환
                .orElse(-1);  // 조건을 만족하지 않으면 기본값 -1 반환

        System.out.println("result1: " + result1);  // result1: 123
        System.out.println("result2: " + result2);  // result2: -1

        // 값이 존재하면 해당 값을 출력
        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3: %d%n", x));  // result3: 456

        // OptionalInt 사용 예시: int 값을 감싸는 Optional
        OptionalInt optInt1 = OptionalInt.of(0);  // 값이 있는 OptionalInt
        OptionalInt optInt2 = OptionalInt.empty();  // 값이 없는 OptionalInt

        System.out.println(optInt1.isPresent());  // true (값이 존재)
        System.out.println(optInt2.isPresent());  // false (값이 없음)

        System.out.println(optInt1.getAsInt());  // 0 (값 추출)
        // System.out.println(optInt2.getAsInt());  // 예외 발생 (값이 없기 때문에 주석 처리)

        // OptionalInt 객체 출력
        System.out.println("optInt1: " + optInt1);  // optInt1: OptionalInt[0]
        System.out.println("optInt2: " + optInt2);  // optInt2: OptionalInt.empty

        // 두 OptionalInt 객체 비교
        System.out.println("optInt1.equals(optInt2)? :" + optInt1.equals(optInt2));  // false

        // null을 감싼 Optional 객체 비교
        Optional<String> opt1 = Optional.ofNullable(null);  // 값이 null인 Optional
        Optional<String> opt2 = Optional.empty();  // 빈 Optional

        System.out.println("opt1: " + opt1);  // opt1: Optional.empty
        System.out.println("opt2: " + opt2);  // opt2: Optional.empty
        System.out.println("opt1.equals(opt2)? :" + opt1.equals(opt2));  // true

        // optStrToint 메서드를 이용한 문자열을 int로 변환
        int result3 = optStrToint(Optional.of("123"), 0);  // 정상적으로 변환
        int result4 = optStrToint(Optional.of(""), 0);  // 빈 문자열, 기본값 반환

        System.out.println("result3: " + result3);  // result3: 123
        System.out.println("result4: " + result4);  // result4: 0
    }
}
