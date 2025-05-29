import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        // iterate() method Ex
        System.out.println("iterate() method 사용 예시");
        Stream<Integer> sum2Stream = Stream.iterate(0, n->n+2);
        sum2Stream.limit(5).forEach(System.out::println);


        // generate() method Ex
        System.out.println("generate() method 사용 예시");
        Stream<Double> random3NuberStream = Stream.generate(Math::random);
        random3NuberStream.limit(3).forEach(System.out::println);

        System.out.println("generate() method int 타입으로 사용 예시");
        Stream<Integer> random4NuberStream = Stream.generate(()->(int)(Math.random()*100));
        random4NuberStream.limit(4).forEach(System.out::println);
    }
}
