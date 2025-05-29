import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

class Student {
    String name;
    boolean isMale; // 설별
    int hak; // 학년
    int ban; // 반
    int score;

    Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    enum Level {
        HIGH, MID, LOW
    }
    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년, %d반, %3d점]",
                name, isMale ? "남":"여",hak, ban, score);
    }
}

public class StreamEx05 {
    public static void main(String[] args) {
        Student[] studentArr = {
                // 이름, 성별 (true - 남자 : false - 여자), 학년, 반, 점수
                new Student("나자바", true, 1, 1, 300),
                new Student("김지미", false, 1, 1, 250),
                new Student("김자바", true, 1, 1, 200),
                new Student("이지미", false, 1, 2, 150),
                new Student("남자바", true, 1, 2, 100),
                new Student("안지미", false, 1, 2, 50),
                new Student("황지미", false, 1, 3, 100),
                new Student("강지미", false, 1, 3, 150),
                new Student("이자바", true, 1, 3, 200),

                // 2학년
                new Student("나자바", true, 2, 1, 300),
                new Student("김지미", false, 2, 1, 250),
                new Student("김자바", true, 2, 1, 200),
                new Student("이지미", false, 2, 2, 150),
                new Student("남자바", true, 2, 2, 100),
                new Student("안지미", false, 2, 2, 50),
                new Student("황지미", false, 2, 3, 100),
                new Student("강지미", false, 2, 3, 150),
                new Student("이자바", true, 2, 3, 200),

        };


        System.out.printf("1. 단순 그룹화(반별로 그룹화)%n");
        Map<Integer, List<Student>> studentByBan = Stream.of(studentArr)
                .collect(groupingBy(Student::getBan));
        for(List<Student> ban : studentByBan.values()) {
            for(Student s :ban) {System.out.println(s);}
        }


        System.out.printf("%n2. 단순 그룹화(성적별로 그룹화)%n");
        Map<Student.Level, List<Student>> studentByLevel = Stream.of(studentArr)
                .collect(groupingBy(s -> {
                    if(s.getScore() >= 200) return Student.Level.HIGH;
                    else if (s.getScore() >= 100) return Student.Level.MID;
                    else return Student.Level.LOW;
                }));
        TreeSet<Student.Level> keySet = new TreeSet<>(studentByLevel.keySet());
        for (Student.Level key : keySet) {
            System.out.println("["+key+"]");
            for (Student s : studentByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }


        System.out.printf("%n3. 단순 그룹화 + 통계(성적별로 그룹화)%n");
        Map<Student.Level, Long> studentCountByLevel = Stream.of(studentArr)
                .collect(groupingBy(s-> {
                    if (s.getScore() >= 200) return Student.Level.HIGH;
                    else if (s.getScore() >= 100) return Student.Level.MID;
                    else return Student.Level.LOW;
                    }, counting())
                );
        for (Student.Level key : studentCountByLevel.keySet())
            System.out.printf("[%s] - %d명, ", key, studentCountByLevel.get(key));
        System.out.println();


        System.out.printf("%n4. 다중 그룹화 (학년별, 반별)");
        Map<Integer, Map<Integer, List<Student>>> studenByHakAndBan = Stream.of(studentArr)
                .collect(groupingBy(Student::getHak, groupingBy(Student::getBan)));
        for (Map<Integer, List<Student>> hak : studenByHakAndBan.values()) {
            for (List<Student> ban : hak.values()) {
                System.out.println();
                for (Student s : ban)
                    System.out.println(s);
            }
        }


        System.out.printf("%n5. 다중 그룹화 + 통계(학년별, 반별 1등)%n");
        Map<Integer, Map<Integer,Student>> topStudentByHakAndBan = Stream.of(studentArr)
                .collect(groupingBy(Student::getHak,
                        groupingBy(Student::getBan,
                                collectingAndThen(
                                        maxBy(Comparator.comparingInt(Student::getScore)),
                                        Optional::get)
                                  ))
                        );
        for (Map<Integer, Student> ban : topStudentByHakAndBan.values())
            for (Student s : ban.values())
                System.out.println(s);



        System.out.printf("%n6. 다중 그룹화 + 통계(학년별, 반별 성적그룹)%n");
        Map<String, Set<Student.Level>> studentByScoreGroup = Stream.of(studentArr)
                .collect(groupingBy(s-> s.getHak() + "-" + s.getBan(),
                        mapping(s-> {
                            if(s.getScore() >= 200) return Student.Level.HIGH;
                            else if (s.getScore() >= 100) return Student.Level.MID;
                            else return Student.Level.LOW;
                        }, toSet())
                        )
                );
        Set<String> keySet2 = studentByScoreGroup.keySet();
        for (String key : keySet2) {
            System.out.println("["+key+"]" + studentByScoreGroup.get(key));
        }
    }
}
