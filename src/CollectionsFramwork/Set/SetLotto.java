package CollectionsFramwork.Set;

import java.util.*;

public class SetLotto {
    public static void main(String[] args) {
        // 로또 번호 갯수를 저장할 Set
        Set<Integer> lottoNumberCount = new HashSet();
        // 랜점의 숫자(중복되지 않음) 6개를 생성
        while((lottoNumberCount.size() < 6)) {
            int lottoNumber = (int)(Math.random()*45)+1;
            lottoNumberCount.add(lottoNumber);
        }
        // Set을 List 형으로 변환하고 정렬
        List<Integer> LottoNumberList = new LinkedList(lottoNumberCount);
        Collections.sort(LottoNumberList);

        // forEach문으로 로또 번호 출력
        System.out.print("로또 번호: ");
        lottoNumberCount.forEach(number -> System.out.print(number + " "));



//        for문으로만 로또 프로그램
//        for(int i=0; lottoNumberCount.size() < 6; i++) {
//            int lottoNumber = (int)(Math.random()*45)+1;
//            lottoNumberCount.add(new Integer(lottoNumber));
//        }
    }
}
