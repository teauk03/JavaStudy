package CollectionsFramwork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("qwer03", "ddqdq120");
        map.put("js021", "ddqdq120");
        // map.put("js021", "ddqdq120"); // 저장 안됨
        map.put("dlaahxkf20", "alffjxjflqdltm1202");
        map.put("alsn031", "rhdryfhqek1234");

        Set set = map.entrySet();
        Iterator it = set.iterator();

        System.out.println("회원 목록 출력");
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("id:" + e.getKey() + " pw:" + e.getValue());
        }
    }
}
