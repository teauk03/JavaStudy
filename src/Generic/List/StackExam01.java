package Generic.List;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class StackExam01 {
    public static void main(String[] args) {
        // 스택 생성 Stack<E>
        Stack<String> VisitingRecords = new Stack<>();
        // 생성된 스택에 요소 넣기 push
        VisitingRecords.push("네이버"); // 1번째 접속 브라우저: 네비어
        VisitingRecords.push("유튜브"); // 2번째 접속 브라우저: 유튜브
        VisitingRecords.push("구글"); // 3번째 접속 브라우저: 구글
        VisitingRecords.push("chat GPT"); // 4번째 접속 브라우저: chat GPT

        // 요소 반환
        System.out.println(VisitingRecords);
        // peek() 메서드: 큐의 맨 앞에 있는 요소를 반환
        System.out.println("사용자의 마지막 접속 기록은: " + VisitingRecords.peek() + " 입니다.");

        // 스택 구조의 맨 위에 있는 요소 삭제
        // VisitingRecords.pop(); // chat GPT 삭제

        // 키보드로 입력 받아 스택에 존재하는 요소 제거
        Scanner scanner = new Scanner(System.in);
        System.out.println("삭제할 검색 기록의 요소를 입력하세요 [네이버, 유튜브, 구글, chat GPT]: ");
        String ElementDel = scanner.nextLine();
        if (VisitingRecords.contains(ElementDel)){
            VisitingRecords.remove(ElementDel);
            System.out.println("해당 브라우저가 삭제 됩니다. 브라우저: " + ElementDel);
        } else { System.out.println("해당 브라우저의 요소가 스택 메모리에 존재하지 않습니다.");}

        System.out.println("삭제 후 브라우저 접속 기록의 큐의 데이터 값은 다음과 같습니다: " + VisitingRecords);

        // 요소 위치 검색
        // 요소가 스택에 존재하지 않는 요소이면 -1를 반환
        System.out.println(VisitingRecords.search("네이버") + "는(은) 네이버 스택 번호입니다.");
        System.out.println(VisitingRecords.search("유튜브")+ "는(은) 유튜브 스택 번호입니다.");
        System.out.println(VisitingRecords.search("구글")+ "는(은) 구글 스택 번호입니다.");
        System.out.println(VisitingRecords.search("chat GPT")+ "는(은) chat GPT 스택 번호입니다.");

    }
}
