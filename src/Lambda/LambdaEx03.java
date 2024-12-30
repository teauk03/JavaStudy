package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            list.add(i);
        }

        System.out.println("list의 모든 요소 출력");
        list.forEach(i->System.out.print("[" + i +"]"));

        System.out.println();
        System.out.println();

        System.out.println("list의 요소중에 2의 배수, 3의 배수 삭제");
        list.removeIf(x-> x%2==0 || x%3==0);
        list.forEach(i->System.out.print("[" + i +"]"));

        System.out.println();
        System.out.println();

        System.out.println("list에 남아있는 모든 요소에 *10");
        list.replaceAll(i->i*10);
        list.forEach(i->System.out.print("[" + i +"]"));
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "1"); map.put("2", "2"); map.put("3", "3"); map.put("4", "4");

        System.out.println();
        System.out.println();

        // map의 모든 요소를 <K,Y> 형식으로 출력
        System.out.println("map의 모든 요소를 <K,Y> 형식으로 출력");
        map.forEach((k,v)->System.out.println("<" + k + "," + v + ">"));



    }
}
