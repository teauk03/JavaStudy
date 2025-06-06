package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx06 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s)->Integer.parseInt(s, 16); // 문자열을 숫자로 변환하는 f 함수
        Function<Integer, String> g = (i)->Integer.toBinaryString(i); // 숫자를 2진 문자열로 변환하는 g 함수

        Function<String, String> h1 = f.andThen(g); // 함수 f + g
        Function<Integer, Integer> h2 = f.compose(g);

        System.out.println(h1.apply("FF")); // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16

        Function<String, String> f2 = x->x; // 항등 함수
        System.out.println(f2.apply("AAA")); // -> "AAA" 그대로 출력

        Predicate<Integer> p = i-> i<100; // 함수 p: i<100
        Predicate<Integer> q = i-> i<200; // 함수 q: i<200
        Predicate<Integer> r = i-> i%2 == 100; // 함수 r: i를 2로 나누고 나머지 값이 100인가
        Predicate<Integer> notP = p.negate(); // 함수 notP: 함수 p의 결과 값을 반전 시킴

        Predicate<Integer> all = notP.and(q.or(r)); // all = notP AND (q OR r)
        System.out.println(all.test(150)); // 150 >= 100 AND (150 < 200 OR 150 % 2 == 100), 출력: true

        String str1 = "abc";
        String str2 = "abc";

        // str1과 str2가 같은지 비교
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}
