package OverloadingOverriding.overriding;
class Car {
    String CompanyName;
    String CarModelName;
    int MaxSpeed;
    String AreaOfPoduction;
    Car(String CompanyName,String CarModelName,int MaxSpeed,String AreaOfPoduction) {
        this.CompanyName = CompanyName;
        this.CarModelName = CarModelName;
        this.MaxSpeed = MaxSpeed;
        this.AreaOfPoduction = AreaOfPoduction;
    }
    void TopSpeed() {
        System.out.println("차가 최고 속도로 달리고 있습니다.");
    }

}
class hyundai extends Car{
    hyundai() {
        super("현대", "소나타", 200, "한국");
    }
    @Override
    void TopSpeed() {
        System.out.println(CompanyName + "의 " + CarModelName +"은 최고 속력인 " + MaxSpeed + "Km 로 달리고 있습니다");
    }
    void PrintAreaOfPoduction() {
        System.out.println(CompanyName +"는" + AreaOfPoduction + "의" + " 기업입니다.");
    }

}
class Lexus extends Car{
    Lexus() {
        super("도요타", "렉서스", 300, "일본");
    }
    @Override
    void TopSpeed() {
        System.out.println(CompanyName + "의 " + CarModelName +"은 최고 속력인 " + MaxSpeed + "Km 로 달리고 있습니다");
    }
    void PrintAreaOfPoduction() {
        System.out.println(CompanyName +"는" + AreaOfPoduction + "의" + " 기업입니다.");
    }
}
public class OverridingExam {
    public static void main(String[] args) {
        hyundai fc = new hyundai();
        Lexus mc = new Lexus();
        mc.TopSpeed();
        mc.PrintAreaOfPoduction();

        fc.TopSpeed();
        fc.PrintAreaOfPoduction();

    }
}
