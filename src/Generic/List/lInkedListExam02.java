package Generic.List;

import java.util.*;

public class lInkedListExam02 {
    static void printList(LinkedList<String> l) { // 리스트의 모든 요소를 출력하는 메서드

        Iterator<String> iterator = l.iterator(); // 반복자
        while (iterator.hasNext()) { // iterator 객체에 요소가 있을때까지 반복
         String e = iterator.next(); // 다음 요소
         String separator;
         if (iterator.hasNext())
             separator = "->"; // 다음 요소가 존재하면 "->" 출력
         else // 다음 요소가 존재하지 않으면 줄 바꿈
             separator = "\n";
         System.out.print(e+separator);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> StringList = new LinkedList<String>();
        StringList.add("실비아");
        StringList.add("잭");
        StringList.add("칸다");
        StringList.add(0, "가브리엘");
        StringList.add(1, "루시퍼");

        Collections.sort(StringList); // 오름차순 요소 정렬
        printList(StringList); // 정렬된 요소 출력 메서드

        Collections.reverse(StringList); // 순서 반대로 바꾸기
        printList(StringList); // 요소 출력 메서드

        int findIndex = Collections.binarySearch(StringList, "잭");
        System.out.println("찾고자 하는 잭의 인덱스는 " + findIndex + "번째 입니다.");
    }
}
