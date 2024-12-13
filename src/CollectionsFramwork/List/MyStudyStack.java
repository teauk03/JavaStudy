package CollectionsFramwork.List;
import java.util.*;

// Stack은 백터를 상속 받아 구현함
public class MyStudyStack extends Vector {
    // 요소를 LIFO 방식으로 삽입
    public Object push(Object item) {
        addElement(item);
        return item;
    }
    // 요소를 LIFO 방식으로 삭제
    public Object pop() {
        Object obj = peek(); // 마지막 요소를 읽고
        removeElementAt(size()-1); // 마지막 요소를 삭제
        return obj; // obj 반환
    }
    // 마지막 요소를 확인
    public Object peek() {
        int len = size();
        if(len == 0) { // 스택이 비어있을 경우
            throw new EmptyStackException(); // EmptyStackException 발생
        }
        return elementAt(len-1); // 마지막 요소를 반환 (index는 0부터 시작하므로 -1을 추가)
    }
    // 요소 검색
    public int search(Object o){
        int i = lastIndexOf(o); // 뒤에서 부터 검색
        if(i>=0) {
            return size()-i; // Stack의 규칙에 맞게 반환
        }
        return -1; // 찾지 못했음 -1 반환;
    }
}
