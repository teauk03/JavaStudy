package Inheritance;

public class SuperMan {
    public static void main(String[] args) {
        Person person = new Person("사람", 0, "알 수 없음");
        ME TeaUk = new ME("강태욱", 22, "남성", "자비로움");
        MySon Lilo = new MySon("릴로", 2, "여성", "너그러움", "귀욤귀욤");
        // 사람의 정보 출력
        person.InfoPrint();

        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();

        // 나의 정보 출력
        TeaUk.InfoPrint();
        TeaUk.CharacteristicsInfo();

        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();

        // 내 딸 릴로의 정보 출력
        Lilo.InfoPrint();
        Lilo.CharacteristicsInfo();
        Lilo.appearanceInfo();
    }
}

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void InfoPrint(){
        System.out.println("안녕하세요 저의 이름은: " + name);
        System.out.println("안녕하세요 저의 나이는: " + age);
        System.out.println("안녕하세요 저의 성별은: " + gender + " 입니다.");
    }
}
class ME extends Person{
    String Characteristics;
    String MeName = "강태욱" ;

    public ME(String name, int age, String gender, String Characteristics) {
        super(name, age, gender);
        this.Characteristics = Characteristics;
    }
    public void CharacteristicsInfo() {
        System.out.println("성격은 " + Characteristics + " 입니다");
    }
    public String getName(){
        return MeName;
    }

}
class MySon extends ME{
    String appearance;
    public MySon(String name, int age, String gender, String Characteristics,  String appearance) {
        super(name, age, gender, Characteristics);
        this.appearance = appearance;
    }
    public void appearanceInfo(){
        System.out.println(super.getName() +" 2세의 "+ name + "는 " + appearance + " 합니다.");
    }

}
