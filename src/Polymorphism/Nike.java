package Polymorphism;
import java.util.Scanner;
import java.util.Random;

class Clothes {
    Scanner scanner = new Scanner(System.in);
    String kind; // 옷 종류
    String color; // 옷 색상
    String temperament; // 제질
    String Brand; // 옷 브랜드

    void SetKind() {
        System.out.print("옷 종류를 입력해주세요: ");
        this.kind = scanner.nextLine();
    }

    void SetColor() {
        System.out.print("옷 색상을 입력해주세요: ");
        this.color = scanner.nextLine();
    }

    void SetTemperament() {
        System.out.print("옷 제질을 입력해주세요: ");
        this.temperament = scanner.nextLine();
    }

    void SetBrand() {
        System.out.print("옷의 브랜드를 입력해주세요: ");
        this.Brand = scanner.nextLine();
    }

    void GetAllInfo() {
        System.out.println("입력한 옷의 정보는 다음과 같습니다.");
        System.out.println("종류: " + this.kind + " 색상: " + this.color + " 제질 " + this.temperament + " 브랜드:" + this.Brand + "입니다.");
    }
}
class FalseNike extends Clothes {

}

public class Nike extends Clothes {
    private int Code; // 하나의 나이키 제품의 고유한 코드
    private Random random = new Random(); // 나이키 제품의 고유한 랜덤값을 위한 Random 객체 생성
    @Override
    void SetBrand() {
        this.Brand = "Nike";
        System.out.println("브랜드: "+ this.Brand );
    }
    public void setCode() {
        this.Code = random.nextInt(9000) + 1000;
    }
    public String getCode() {
        return "해당 옷의 고유한 코드는:" + Code;
    }
    @Override
    void GetAllInfo() {
        System.out.println("조회한 나이키 옷의 정보는 다음과 같습니다.");
        System.out.println("종류: " + this.kind );
        System.out.println("색상: " + this.color);
        System.out.println("제질 " + this.temperament);
        System.out.println("브랜드:" + this.Brand);
        System.out.println("코드: " + this.Code);
    }

    public static void main(String[] args) {
        Nike nike = new Nike();
        System.out.println("나이키 옷");
        System.out.println("=============");
        nike.SetKind();
        nike.SetColor();
        nike.SetTemperament();
        nike.SetBrand();
        nike.GetAllInfo();

        System.out.println("=============");

        System.out.println("가품 나이키 옷");
        System.out.println("=============");
        Clothes FalseNike = new FalseNike();
        FalseNike.SetKind();
        FalseNike.SetColor();
        FalseNike.SetTemperament();
        FalseNike.SetBrand();
        FalseNike.GetAllInfo();

    }
}
