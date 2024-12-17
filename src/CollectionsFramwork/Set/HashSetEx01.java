package CollectionsFramwork.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("Java");
        s.add("Very");
        s.add("Hard");

        Iterator<String> it = s.iterator();

        while (it.hasNext()) { System.out.println(it.next());}
    }
}


// 출력 값: (저장 순서 유지 X)
//Java
//Hard
//Very
