package Array;

public class Array01 {
    public static void main(String[] args) {
        int[] array01 = new int[5];
        array01[0] = 1;
        array01[1] = 2;
        array01[2] = 3;
        array01[3] = 4;
        array01[4] = 5;
        int[] array02 = new int[]{1,2,3,4,5};
        int[] array03 = {1,2,3,4,5};

        System.out.println("array01 의 출력");
        for (int i=0; i<5; i++) {
            System.out.println(array01[i]);
        }
        System.out.println("array02 의 출력");
        for (int i=0; i<5; i++) {
            System.out.println(array02[i]);
        }
        System.out.println("array03 의 출력");
        for (int i=0; i<5; i++) {
            System.out.println(array03[i]);
        }
    }
}
