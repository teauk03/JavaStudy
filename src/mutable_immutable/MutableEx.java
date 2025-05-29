package mutable_immutable;

import java.util.ArrayList;

class MutableEx {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        // ArrayList에 {10, 20, 30} 차례로 요소 추가
           numList.add(10);
           numList.add(20); 
           numList.add(30); 

        // 확인 
        System.out.println("원본: "+ numList);

        // 요소 수정 (30->50)
        numList.set(2, 50);

        // 확인 
        System.out.println("변경 후: " + numList);

        
        
    }
}
