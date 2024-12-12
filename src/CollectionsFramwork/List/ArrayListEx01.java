package CollectionsFramwork.List;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {
    static void printList1(ArrayList list1){
        System.out.println("list1: " + list1);
    }
    static void printList2(ArrayList list2){
        System.out.println("list2: " + list2);
    }
    static void printAllList(ArrayList list1, ArrayList list2){
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        printList1(list1); //  list1: [5(0), 4(1), 2(2), 0(3), 1(4), 3(5)]

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 인덱스 1~4까지의 요소를 반환~~
        printList2(list2); //(1~3) 4, 2, 0

        System.out.println();

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("정렬함");
        printList1(list1);
        printList2(list2);

        System.out.println();
        System.out.println("list2에 있는 요소들이 list1에 있는가? " + list1.containsAll(list2));
        list2.add(new String("B"));
        list2.add(new String("C"));
        list2.add(3, new String("A")); // index[3]에 저장 되어있다가
        printAllList(list1, list2);
        System.out.println("인덱스[3]에 있는 요소를 AA로 교체");
        list2.set(3, new String("AA")); // index[3]에 저장되어 있던 요소를 이걸로 바뀜
        printList2(list2);

        System.out.println();
        // 0,2,4 제외하고 list1에 있던 다른 요소들 전부 제거 (변화, 즉 삭제가 되었으면 true를 반환함)
        System.out.println("list1에서 list1과 list2의 공통 요소(교집합)만 남기고 삭제: " + list1.retainAll(list2));
        printAllList(list1, list2);


        System.out.println();
        System.out.println("list2에서 list1에 포함된 요소들을 삭제");
        System.out.println("삭제 전 list2 목록:    " + list2);
        for(int i = list2.size()-1; i>=0; i-- ) {
            if(list1.contains(list2.get(i))) {
                System.out.println();
                list2.remove(i);
                printAllList(list1, list2); }
        }

    }
}
