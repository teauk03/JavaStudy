package CollectionsFramwork.List;

import java.util.*;

public class ListPerformanceTest {
    // 순차적으로 리스트에 추가
    public static long addSequentially(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_0000; i++) { // 비어있는 list에 100만개 요소 추가
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // 중간에 리스트에 요소 추가
    public static long addInMiddle(List<String> list) {
        long start = System.currentTimeMillis();
        ListIterator<String> iterator = list.listIterator(list.size() / 2); //50_0000, 50_0000
        for (int i = 0; i < 10000; i++) { // 50_0000 [10000개 요소 추가] 50_0000
            iterator.add("X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // 뒤에서부터 리스트 요소 제거
    public static long removeFromEnd(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // 중간에서 리스트 요소 제거
    public static long removeFromMiddle(List<String> list) {
        long start = System.currentTimeMillis();
        ListIterator<String> iterator = list.listIterator(list.size() / 2);
        for (int i = 0; i < 10000 && iterator.hasNext(); i++) {
            iterator.next();
            iterator.remove();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(200_0000);
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("=== 순차적으로 추가하기 ===");
        System.out.println("ArrayList: " + addSequentially(arrayList));
        System.out.println("LinkedList: " + addSequentially(linkedList));
        System.out.println();

        System.out.println("=== 중간에 추가하기 ===");
        System.out.println("ArrayList: " + addInMiddle(arrayList));
        System.out.println("LinkedList: " + addInMiddle(linkedList));
        System.out.println();

        System.out.println("=== 순차적으로 제거하기 ===");
        System.out.println("ArrayList: " + removeFromEnd(arrayList));
        System.out.println("LinkedList: " + removeFromEnd(linkedList));
        System.out.println();

        System.out.println("=== 중간에서 제거하기 ===");
        System.out.println("ArrayList: " + removeFromMiddle(arrayList));
        System.out.println("LinkedList: " + removeFromMiddle(linkedList));
        System.out.println();
    }
}
