package Generic.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListBox = new ArrayList<Integer>();
        arrayListBox.add(1);
        arrayListBox.add(2);
        arrayListBox.add(3);
        arrayListBox.add(4);
        arrayListBox.add(5);
            for (int index=0; index<arrayListBox.size(); index++) {
                System.out.print("[" + index + "]");
            }
            System.out.println(" ");
            for(int i=0; i<arrayListBox.size(); i++){
                System.out.print("[" + arrayListBox.get(i)+ "]");
            }
            System.out.println();
            System.out.print(" 인덱스 1 삭제 ");
        arrayListBox.remove(1); // 인덱스 1에 위치한 요소 삭제
            System.out.println();
            for (int index=0; index<arrayListBox.size(); index++) {
            System.out.print("[" + index + "]");
            }
            System.out.println();
            for (int e : arrayListBox) {
                System.out.print("[" +e+ "]");
            }
        // 요소 정렬
        Collections.sort(arrayListBox);
            // 인덱스 1의 값을 2 -> 20 으로 변경
            arrayListBox.set(1, 20);
            System.out.println();
            System.out.println(" 인덱스 [1]: 2 -> 20 으로 변경 ");
            for (int index=0; index<arrayListBox.size(); index++) {
            System.out.print("[" + index + "]");
            }
            System.out.println();
            for (int e : arrayListBox) {
            System.out.print("[" +e+ "]");
            }
            System.out.println();
            // 리스트 크기 출력
            System.out.println("리스트의 크기 : " + arrayListBox.size());
    }
}
