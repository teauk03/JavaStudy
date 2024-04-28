package Generic.List;

import java.util.Stack;

public class StackExam02 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.쿠팡");
        goURL("2.네이버");
        goURL("3.카카오");
        goURL("4.배달의 민족");

        PrintStatus();

        moveBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        PrintStatus();

        moveForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        PrintStatus();
    }

    // 상태 출력 메서드
    public static void PrintStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        if (!back.empty()) // back 스택이 비어있지 않을 때에만 peek 호출
            System.out.println("현재화면은'" + back.peek() + "' 입니다.");
        System.out.println();
    }

    // 원하는 사이트로 이동하는 메서드
    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty())
            forward.clear();
    }

    // 웹 브라우저의 앞으로 가기 메서드
    public static void moveForward() {
        if (!forward.empty())
            back.push(forward.pop());
    }

    // 웹 브라우저의 뒤로 가기 메서드
    public static void moveBack() {
        if (!back.empty())
            forward.push(back.pop());
    }
}
