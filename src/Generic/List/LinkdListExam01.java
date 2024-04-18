package Generic.List;

import java.util.LinkedList;

public class LinkdListExam01 {
    public static void main(String[] args) {
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number.add(100);
        Number.add(200);
        Number.add(300);
        Number.add(400);
        Number.add(500);
        // 인덱스 출력
        for (int index=0; index< Number.size(); index++) {
            System.out.print("["+ index + "]");
        }
        System.out.println();
        // 요소 출력
        for (int i=0; i<Number.size(); i++) {
            System.out.print("["+Number.get(i) + "]");
        }
        // 인덱스 2에 있는 삭제
        Number.remove(2);

        System.out.println();
        // 인덱스 출력
        for (int index=0; index< Number.size(); index++) {
            System.out.print("["+ index + "]");
        }
        System.out.println();
        // 요소 출력
        for (int i=0; i<Number.size(); i++) {
            System.out.print("["+Number.get(i) + "]");
        }
        // 인덱스 2에 700으로 변경
        Number.set(2, 700);
        System.out.println();
        // 인덱스 출력
        for (int index=0; index< Number.size(); index++) {
            System.out.print("["+ index + "]");
        }
        System.out.println();
        // 요소 출력
        for (int i=0; i<Number.size(); i++) {
            System.out.print("[" + Number.get(i) + "]");
        }
        System.out.println();
        System.out.println("리스트의 크기: " + Number.size());
    }
}
