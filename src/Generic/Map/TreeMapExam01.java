package Generic.Map;
// TreeMap - 이진 트리의 구조를 통해 데이터를 저장하는 자료 구조
// 키-값 의 정렬되어 있고, 여기서 키는 정렬되어 있다.

// Tree 자료 구조는 계층도와 같이 계층적인 구조를 나타낼때 사용하는 자료구조이다.

import java.util.*;

class DelUser {
    public static void removeEmail(TreeMap<String, String> users, String email) {
        // 키보드로 이메일을 입력받은 key(이메일)로 TreeMap에서 해당 자료을 삭제
        String removedPassword = users.remove(email);
        if (removedPassword != null) {
            System.out.println(email + " 이메일을 가진 사용자의 정보를 삭제했습니다.");
        } else {
            System.out.println(email + " 이메일을 가진 사용자를 찾을 수 없습니다.");
        }
    }
}

class PrintUser {
    public static void printTreeMap(TreeMap<String, String> users) {
        System.out.println("현재 TreeMAP에 있는 회원들의 데이터");
        // 키(이메일)와 값(비밀번호) 출력
        for (String key : users.keySet()) {
            System.out.println(String.format("이메일 : %s, 비밀번호 : %s", key, users.get(key)));
        }
    }
}

public class TreeMapExam01 {
    public static void main(String[] args) {
        TreeMap<String, String> users = new TreeMap<>();

        // 사용자 데이터 추가
        users.put("kimjiyeon@example.com", "123456789");
        users.put("leeseungwoo@example.com", "abcdefghi");
        users.put("parkyeonghee@example.com", "987654321");
        users.put("choiseongjun@example.com", "abcdef1234");
        users.put("jeongsu bin@example.com", "password123");
        users.put("honggildong@example.com", "ilovecoding");
        users.put("imcheolsu@example.com", "letmein2022");
        users.put("hanmiyeong@example.com", "securepassword");
        users.put("kangdoyoon@example.com", "doyoon123");
        users.put("songjinwoo@example.com", "jinwoo456");

        // TreeMap 출력
        PrintUser.printTreeMap(users);

        // 삭제할 이메일 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 이메일을 입력하세요: ");
        String email = scanner.nextLine();

        // 이메일 삭제
        DelUser.removeEmail(users, email);

        // TreeMap 출력
        PrintUser.printTreeMap(users);
    }
}
