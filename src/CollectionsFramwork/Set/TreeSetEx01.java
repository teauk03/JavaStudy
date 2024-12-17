package CollectionsFramwork.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx01 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        int[] score = {80,90,99,70,69,50,40,11};

        for (Integer Score : score) {
            set.add(Score);
        }
        System.out.println("불합격한 점수: " + set.headSet(80, false)); // 80미만 불합격
        System.out.println("합격 점수: " + set.tailSet(80, true)); // 80 이상 합격
    }
}
