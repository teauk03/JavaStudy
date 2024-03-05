package Inheritance.SuperCreator;
class Point {
    int x;
    int y;
    Point(int x, int y) {  // class Point 의 생성자
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x :" + x + ", y :" + y;
    }

}
class Print3D extends Point {
    int z;
    Print3D (int x, int y, int z) { // class Print3D의 생성자
        super(x, y); // 상속 받은 x,y는 super() 키워드를 통해 호출 및 초가화
        this.z = z;
    }
    String getLocation() { // 메서드 오버라이딩
        return "x :" + x + ", y :" + y + ", z :" + z;
    }

}

public class PointTest {
    public static void main(String[] args) {
        Print3D p3 = new Print3D(1,2,3); // p3의 x,y,z 값 지정
        System.out.println(p3.getLocation()); // p3의 getLocation() 반환값 출력

    }
}
