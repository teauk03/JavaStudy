import java.util.Comparator;
import java.util.stream.Stream;

class TheGloryCasts implements Comparable<TheGloryCasts> {
    String name;
    String job;
    int age;

    TheGloryCasts(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String toString() {
        return String.format("[%s, %s, %d]", name,job,age);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(TheGloryCasts p) {
        return this.name.compareTo(p.getName());
    }
}
public class StreamEx02 {
    public static void main(String[] args) {
        Stream<TheGloryCasts> theGloryCastsStream = Stream.of(
                new TheGloryCasts("전재준" , "골프장 사장님", 1987),
                new TheGloryCasts("이사라", "예술인", 1987),
                new TheGloryCasts("박연진", "기상 캐스터", 1987),
                new TheGloryCasts("손명오", "전재준 운전기사", 1987),
                new TheGloryCasts("문동은", "초등학교 교사", 1987),
                new TheGloryCasts("강감찬", "고려[상원수]", 948)
        );

        theGloryCastsStream.sorted(Comparator.comparing(TheGloryCasts::getName)// 이름으로 한번 정렬 후
                .thenComparing(Comparator.comparingInt(TheGloryCasts::getAge))) // 나이로 추가 정렬
                .forEach(System.out::println);
    }
}
