package collectionsFramwork.list;

import java.util.Vector;

public class VectorEx01 {
    static void vectorPrint(Vector v) {
        System.out.println("백터 안에 들어있는 요소들: " + v);
        System.out.println("백터의 크기는: " +  v.size());
        System.out.println("백터의 용량은: " +  v.capacity());
    }
    public static void main(String[] args) {
        Vector v = new Vector(5); // Vector 용량을 5로 지정
        v.add("1");
        v.add("2");
        v.add("3");
        // Capacity = 5 ["1","2","3",Null, Null]
        vectorPrint(v);

        System.out.println();
        v.trimToSize(); // Vector의 빈 용량을 삭제
        System.out.println("trimToSize 사용 후");
        vectorPrint(v);

        System.out.println();
        v.ensureCapacity(6);
        System.out.println("ensureCapacity(6) 사용 후");
        vectorPrint(v);

        System.out.println();
        v.setSize(7);
        System.out.println("setSize(7) 사용 후");
        // 백터 내에 새 요소를 생성할 때에 capacity 용량이 부족할때 자동적으로 2배의 크기로 증가 시킴
        vectorPrint(v);

        System.out.println();
        v.clear();
        System.out.println("clear() 사용 후");
        vectorPrint(v);
    }
}
