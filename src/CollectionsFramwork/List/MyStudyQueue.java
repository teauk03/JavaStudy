package collectionsFramwork.list;


import java.util.*;

public class MyStudyQueue {
    private LinkedList list = new LinkedList();
    // FIFO 방식으로 요소 삽입
    public void offer(Object item){
        list.addLast(item);
    }
    // FIFO 방식으로 요소 추출
    public Object poll() {
        if(list.isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }
    // 첫번째 요소 확인
    public Object peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }
}
