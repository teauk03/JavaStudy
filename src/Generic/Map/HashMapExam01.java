package Generic.Map;

import java.util.HashMap;

public class HashMapExam01 {
    public static void main(String[] args) {
        HashMap<String, String> Info = new HashMap<String, String>();
        System.out.println("=================데이터======================");
        Info.put("문", "이성");
        Info.put("박", "명철");
        Info.put("신", "해철");
        Info.put("김", "이용");
        Info.put("강", "이식");
        Info.put("이", "성계");

        System.out.println("이 사람들의 성은: " + Info.keySet() + "씨 입니다.");
        for (String key : Info.keySet()){
            System.out.println(String.format("성: %s , 이름: %s",key,Info.get(key)));
        }

        System.out.println("=================remove(문)======================");
        // 요소 삭제 remove()
        Info.remove("문");
        for (String key : Info.keySet()){
            System.out.println(String.format("성: %s , 이름: %s",key,Info.get(key)));
        }

        System.out.println("=================replace(강이식->강감찬)======================");
        Info.replace("강","감찬"); // 강이식을 강감찬으로 변경
        for (String key : Info.keySet()){
            System.out.println(String.format("성: %s , 이름: %s",key,Info.get(key)));
        }

        System.out.println("=================HashMapSize======================");
        System.out.println(Info.size());
    }
}
