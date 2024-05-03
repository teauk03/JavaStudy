package Generic.iteratorInterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class iteratorExam02 {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);

        // ListIterator 를 활용하여 순방향과 역방향으로 출력
        ListIterator<Integer> il = i.listIterator();


        // 순방향
        System.out.println(" == 순방향으로 출력 == ");
        while(il.hasNext()) {
            System.out.println(il.next());
        }

        // 역방향
        System.out.println(" == 역방향으로 출력 == ");
        while(il.hasPrevious()) { //  반대로 동작하는 Previous
            System.out.println(il.previous());
        }

    }
}
