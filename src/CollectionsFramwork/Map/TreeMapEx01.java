package CollectionsFramwork.Map;

import java.util.*;

public class TreeMapEx01 {

    // 값을 기준으로 내림차순으로 정렬하는 Comparator 클래스
    static class ValueComparator implements Comparator {
        // compare 메서드를 오버라이드하여 map 엔트리의 값을 기준으로 내림차순 정렬
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                // o1과 o2를 Map.Entry로 캐스팅
                Map.Entry e1 = (Map.Entry)o1;
                Map.Entry e2 = (Map.Entry)o2;

                // 각 엔트리의 값을 비교 (정수형 값으로 변환 후 비교)
                int v1 = ((Integer)e1.getValue()).intValue();
                int v2 = ((Integer)e2.getValue()).intValue();
                return v2 - v1; // v2 - v1로 반환하여 내림차순 정렬
            }
            return -1; // 만약 객체가 Map.Entry 타입이 아니라면 -1 반환
        }
    }

    // 막대 그래프의 표시를 위한 헬퍼 메서드
    public static String printBar(char ch, int value) {
        // 크기가 'value'인 char 배열을 만들어서 'ch'로 채운다
        char[] bar = new char[value];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch; // 배열의 각 자리에 'ch'를 할당
        }
        return new String(bar); // 문자 배열을 문자열로 변환하여 반환
    }

    public static void main(String[] args) {
        // 데이터를 미리 정의한 배열
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
        // TreeMap 생성 (키를 자동으로 정렬)
        TreeMap map = new TreeMap();

        // data 배열을 순회하면서 TreeMap에 데이터를 추가
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                // 이미 해당 키가 존재하면 값(value)을 1 증가
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {
                // 해당 키가 존재하지 않으면 값을 1로 추가
                map.put(data[i], new Integer(1));
            }
        }

        // TreeMap의 엔트리들을 출력하는 반복자
        Iterator it = map.entrySet().iterator();

        // 기본적으로 오름차순으로 정렬된 결과 출력
        System.out.println("== 기본 정렬 ==");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            // 키와 값을 출력 (값에 해당하는 막대도 표시)
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }

        System.out.println();

        // TreeMap의 엔트리들을 Set으로 가져오고 이를 List로 변환
        Set set = map.entrySet();
        List list = new ArrayList(set);

        // 값에 따라 내림차순으로 정렬
        Collections.sort(list, new ValueComparator());
        it = list.iterator();

        // 값의 크기가 큰 순서대로 정렬된 결과 출력
        System.out.println(" == 값의 크기가 큰 순서로 정렬 == ");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            // 키와 값을 출력 (값에 해당하는 막대도 표시)
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }
}
