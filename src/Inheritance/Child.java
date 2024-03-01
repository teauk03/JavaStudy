package Inheritance;

import java.util.Scanner;
import java.util.Arrays;

class Parent {
    public String name = "강감찬";
    public String personality = "고집이 강하다.";
    protected String[] properties = {"금 10만", "강남의 땅 100평", "진주 강씨의 피"};

    public void showPersonality() {
        System.out.println("진주 강씨의 공통된 성격은 " + personality + "입니다.");
    }

    public void showProperties() {
        System.out.println("조상 " + name + "의 재산은 " + Arrays.toString(properties) + "입니다.");
    }
}

public class Child extends Parent {
    String[] newProperties;     // 자손인 내가 새롭게 가진 재산을 넣을 배열

    Child(String name, String[] newProperties) { // 생성자
        this.name = name;
        this.newProperties = newProperties;
    }

    public void showAllProperties() {
        System.out.print("조상으로부터 물려받은 재산: ");
        showProperties();
        System.out.println("자신이 새롭게 가진 재산: " + Arrays.toString(newProperties)); // 자손의 재산 출력
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드로 정보를 입력할 수 있기 위한 스캐너 객체 생성

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 이름이 "강"으로 시작하지 않으면 정보 출력하지 않음
        if (name.startsWith("강")) {

            System.out.print("새로운 자신의 재산을 입력하세요. <쉼표(,)로 구분하여 입력하세요>: ");
            String newPropertiesInput = scanner.nextLine();
            String[] newProperties = newPropertiesInput.split(", ");

            // Child 객체 생성 시, 입력 받은 자신의 이름과 성격, 그리고 자신이 새롭게 입력받은 재산을 설정
            Child child = new Child(name, newProperties);

            // Child 객체의 이름과 성격, 그리고 모든 재산 출력
            System.out.println("이름: " + child.name);
            child.showPersonality();
            child.showAllProperties();
        } else {
            System.out.println("강씨가 아니라 정보를 출력할 수 없습니다.");
            System.out.println("보고 싶으면 족보를 바꾸십쇼.");
        }
        scanner.close();
    }
}
