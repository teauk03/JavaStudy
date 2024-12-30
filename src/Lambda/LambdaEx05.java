package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaEx05 {
    static int[] doSomething(IntUnaryOperator op, int[] arr){
        int[] newArr = new int[arr.length];

        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = op.applyAsInt(arr[i]);
        }
        return newArr;
    }

    static void printEventNum(IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            if (p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static void makeRandomList(IntSupplier s, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.getAsInt();
        }
    }

    public static void main(String[] args) {
        IntSupplier s = () -> (int) (Math.random() * 100) + 1;  // 1~100 사이의 랜덤 정수
        IntConsumer c = i -> System.out.print(i + ", ");  // 출력은 줄바꿈 없이
        IntPredicate p = i -> i % 2 == 0;  // 짝수인지 확인
        IntUnaryOperator op = i -> i / 10 * 10;  // 10의 자리까지 버림

        int[] arr = new int[10];
        makeRandomList(s, arr);  // 랜덤 값 할당
        System.out.print("생성된 숫자들: ");
        System.out.println(Arrays.toString(arr));  // 배열 출력

        System.out.print("짝수 출력: ");
        printEventNum(p, c, arr);  // 짝수 출력

        int[] newArr = doSomething(op, arr);  // 값 변환
        System.out.print("뒷자리 없앤 숫자들: ");
        System.out.println(Arrays.toString(newArr));  // 변환된 배열 출력
    }
}
