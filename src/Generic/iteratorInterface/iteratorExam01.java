package Generic.iteratorInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class iteratorExam01 {
    public static void main(String[] args) {
        LinkedList<String> User = new LinkedList<String>();
        User.add("최무식");
        User.add("마동석");
        User.add("강감찬");
        User.add("이순신");
        User.add("이방원");

        Iterator<String> userPrint = User.iterator();
        while(userPrint.hasNext()) { // 다음 요소가 존재하는지 확인
            System.out.println(userPrint.next() + ""); // 다음 요소 반환
        }
    }
}
//  이 코드는 Iterator Interface 를 활용하여 간단ㅘㅇ 요소를 순방향(순차적)으로 탐색하고 출력하는 코드이다.