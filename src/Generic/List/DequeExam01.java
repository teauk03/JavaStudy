package Generic.List;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class DequeExam01 {
    public static void main(String[] args) {
        Deque<String> Memory = new ArrayDeque<String>();

        // 1번째부터 10번째까지의 요소 삽입
        for (int i = 1; i <= 10; i++) {
            Memory.add(i + " 번째 삽입 데이터");
        }

        // 요소 반환
        for (String element : Memory) {
            System.out.println(element);
        }

        Memory.remove(); // 큐의 맨 앞에 있는 요소 삭제 (데큐는 먼저 추가된 요소가 먼저 삭제되므로 1번째 데이터 값이 삭제가 된다.)
        Memory.remove("3 번째 삽입 데이터"); // 인덱스의 3번째 존재하는 데이터 값을 삭제 (3 번째 삽입 데이터가 삭제 된다)
        Memory.removeLast(); // 큐의 마지막에 있는 요소 삭제 (10번째 데이터의 값이 삭제 된다.)
        System.out.println("=====================================================");
        // 삭제 후 큐 데이터들 조회
        for (String element : Memory) {
            System.out.println(element);
        }

        System.out.println("=====================================================");
        // TODO Deque(데큐)에 원하는 위치에 요소를 삽입할려면 어케 해야할까?
        // 1. 중간에 요소를 삽입할 위치의 요소를 임시 테크에 저장 (필요한 것: 넣을 인덱스의 번호, 새로운 데이터, 앞의 2개의 필요한 것을 넣을 임시 테크 생성)
        // 2. 임시 테크에 저장한 것을 원래 테크에 추가하는 방법

        int index = 3; // 삽입할 위치의 인덱스
        String newData = "새로운 데이터"; // 삽입할 요소
        Deque<String> tempDeque = new ArrayDeque<>(); // 삽입할 요소를 임시로 저장한 임시 데크 추가

        // 삽입할 위치까지의 요소를 임시 테크에 저장
        for(int i=0; i<index; i++) {
            tempDeque.addLast(Memory.removeFirst());
        }
        // 새로운 데이터를 임시 테크에 추가한다.
        Memory.addFirst(newData);

        // 임시 데크에 저장된 요소를 다시 원래의 데크에 추가
        while (!tempDeque.isEmpty()) {
            Memory.addFirst(tempDeque.removeLast());
        }

        // 결과 출력
        for (String element : Memory) {
            System.out.println(element);
        }
    }
}
