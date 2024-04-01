package Array.ReferenceArray;

public class Array02 {
    public static void main(String[] args) {
        ItemForArray[] array = new ItemForArray[5];
        ItemForArray array2[] = new ItemForArray[5];

        array[0] = new ItemForArray(450, "도란의 검");
        array[1] = new ItemForArray(1000, "야망의 몽둥이");
//        array2[0] = new ItemForArray(400, "도란링");

        ItemForArray li =  new ItemForArray(3200, "강철의 심장");

        System.out.println(array[0].getName());
        System.out.println(li.getName());
        System.out.println(array2[0].getName());
     }
}
