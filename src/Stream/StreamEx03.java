
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx03 {
    public static void main(String[] args) {
        List<File> files = List.of(
                new File("Ex1.java"),
                new File("Hello.c"),
                new File("index.js"),
                new File("설명"),
                new File("사진"),
                new File("index.js"),
                new File("Ex1.java"),
                new File("ss.png")
        );

        // 원본 파일 출력
        System.out.println("원본 파일:");
        files.forEach(file -> System.out.print("[" + file.getName() + "]"));
        System.out.println("\n--------------");

        // 확장자가 있는 파일 필터링
        List<String> withExtensions = files.stream()
                .map(File::getName)
                .filter(name -> name.contains("."))
                .collect(Collectors.toList());

        System.out.println("확장자가 있는 파일:");
        withExtensions.forEach(name -> System.out.print("["+ name + "]"));
        System.out.println("\n--------------");

        // 대문자로 변환
        List<String> upperCaseNames = withExtensions.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("대문자로 변환 후:");
        upperCaseNames.forEach(name -> System.out.print("[" + name + "]"));
        System.out.println("\n--------------");

        // 중복 제거
        List<String> distinctNames = upperCaseNames.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("중복 제거 후:");
        distinctNames.forEach(name -> System.out.print("[" + name + "]"));
        System.out.println("\n--------------");

        // 최종 결과 출력
        System.out.println("최종 결과:");
        distinctNames.forEach(name -> System.out.print("[" + name + "]"));
        System.out.println("\n--------------");
    }
}
