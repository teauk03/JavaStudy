package algorithms;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        //TODO 하노이 탑 문제: 재귀적인 알고리즘의 이해
        // 한 번에 하나의 원반만 움직일 수 있다.
        // 자신보다 작은 원반이 그 아래에 놓일 수 없다.

        // 하노이 탑은 원래 원반이 저장되어있는 기둥 1개 보조 1개 최종 1개의 형태를 가져 원반을 정해진 규칙에 맞게 저장한다.
        /**
         * 하노이 탑 문제를 해결하기 위한 재귀 메서드.
         * n 개의 원반을 주어진 기둥에서 목표 기둥으로 옮깁니다.
         *
         * @param n 원반의 수
         * @param origin 출발 기둥
         * @param assistance 보조 기둥
         * @param destination 목적지 기둥
         */


        // 우선 원반을 몇개 넣을 것인지 지정 (층)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solveHanoiTower(n, "원래기둥"," 보조 기둥"," 최종기둥");
        }

        // 위 규칙에 맞는 하노이 탑 규칙 메서드
        public static void solveHanoiTower(int n, String origin, String assistance, String destination) {
            if (n == 0) {
                return; // 옮길 갯수가 없으면 프로그램 종료
            } else {
                solveHanoiTower(n - 1, origin, destination, assistance);
                System.out.println("원판 " + n + "을(를) " + origin + "에서 " + destination + "으로 이동");
                solveHanoiTower(n - 1, assistance, origin, destination);
            }
        }
    }


    // 피드백 적용한 코드
// 피드백 내용
//            1. 함수명은 동사를 사용
//            2. 변수명을 좀 더 시맨틱하게 사용
//            3. 하노이탑 로직이 완전해 보이지 않음

// 기존 코드
//  public class HanoiTower {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        HanoiTowerRule(n, "원래기둥"," 보조 기둥"," 최종기둥");
//    }
//
//    // 위 규칙에 맞는 하노이 탑 규칙 메서드
//    public static void HanoiTowerRule(int N, String Originally,String Assistance, String Final) { // N = 원판 갯수, F= 처음 기둥, S= 보조 기둥, T= 최종 기둥
//        if (N == 0) {
//            return; // 옮길 갯수가 없으면 프로그램 종료
//        }  else {
//            System.out.println("원판" + N + "을 " + Originally +"에서" + Final + "으로 이동");
//            HanoiTowerRule(N - 1, Originally, Assistance, Final);
//        }
//    }
//}

