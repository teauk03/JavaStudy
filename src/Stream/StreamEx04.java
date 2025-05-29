import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx04 {
    public static void main(String[] args) {
        // 2개의 배열을 포함하는 스트림 생성
        Stream<String[]> strArrStrm = Stream.of(
                new String[] {"abc", "def", "ghi"},
                new String[] {"ABC", "DEF", "GHI"}
        );

        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
        strStrm.map(String::toLowerCase)
                .distinct()  // 중복된 값을 제거
                .sorted()    // 알파벳 순으로 정렬
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Belive or not It is true",
                "Do or do not There no try"
        };

        // lineArr 배열을 스트림으로 변환
        Stream<String> lineStrm = Arrays.stream(lineArr);

        // 각 문장을 split(" +")를 이용해 단어로 나눈 후, Stream<String>을 생성
        lineStrm.flatMap(line -> Stream.of(line.split(" +")))  // 공백을 기준으로 단어 분리
                .map(String::toLowerCase)  // 각 단어를 소문자로 변환
                .distinct()  // 중복 단어 제거
                .sorted()    // 알파벳 순으로 정렬
                .forEach(System.out::println);
        System.out.println();

        // 두 개의 스트림을 결합하여 단어들을 처리
        Stream<String> strStrm1 = Stream.of("AAA", "BBB", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

        // Stream<Stream<String>> 형태로 두 스트림을 포함하는 스트림 생성
        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);

        // Stream<Stream<String>>을 평탄화하여 하나의 스트림으로 결합
        Stream<String> strStream = strStrmStrm
                .flatMap(s -> s);  // 각 스트림을 평탄화하여 하나의 스트림으로 결합

        // 결합된 스트림에서 각 단어를 소문자로 변환하고, 중복을 제거한 후, 알파벳 순으로 정렬하여 출력
        strStream.map(String::toLowerCase)  // 소문자로 변환
                .distinct()  // 중복 제거
                .sorted()    // 알파벳 순으로 정렬
                .forEach(System.out::println);  // 최종 출력
    }
}
