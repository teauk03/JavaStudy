/*
 그 정적배열에 데이터를 삽입하거나 삭제하는 insert와 erase 메소드를 구현해라
 시간복잡도는 On
 앞뒤 삽입삭제가아니라 k번째 요소 삽입삭제
* */

public class ArrayOperations {
    public static void insert(int idx, int num, int[] arr, int len) {
//        for (int i = len; i > idx; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[idx] = num;

    }

    public static void erase(int idx, int[] arr, int len) {
//        for (int i = idx; i < len - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        arr[len - 1] = 0;  // 배열의 마지막 요소를 0으로 초기화
    }

    public static void printStaticArray(int[] arr, int len) {
        for(int i = 0; i < len; i++) System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("===== insert_test =====");
        int[] arr = new int[10];
        arr[0] = 10; arr[1] = 20; arr[2] = 30;
        int len = 3;
        insert(3, 40, arr, len);
        len = 4;
        printStaticArray(arr, len);
        insert(1, 50, arr, len);
        len = 5;
        printStaticArray(arr, len);
        insert(0, 15, arr, len);
        len = 6;
        printStaticArray(arr, len);

        System.out.println("===== erase_test =====");
        len = 6;
        erase(4, arr, len);
        len = 5;
        printStaticArray(arr, len);
        erase(1, arr, len);
        len = 4;
        printStaticArray(arr, len);
        erase(3, arr, len);
        len = 3;
        printStaticArray(arr, len);
    }
}