package CollectionsFramwork.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAccessTimeTest {
    public static void add(List list) {
        for(int i = 0; i<10_0000; i++){
            list.add(i + "");
        }
    }
    public static long accessTimePrint(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(100_0000);
        LinkedList linkedList = new LinkedList();
        add(arrayList);
        add(linkedList);


        System.out.println("===  접근시간 테스트  ===");
        System.out.println("ArrayList의 접근시간: " + accessTimePrint(arrayList));
        System.out.println("LinkedList의 접근시간: " + accessTimePrint(linkedList));
    }
}
