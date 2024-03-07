package OverloadingOverriding.overloading;

public class OverloadingExam {
    void sum(int a, int b) {
        System.out.println("두 가지의 수를 더할 수 있는 메서드의 값은: "+(a+b));
    }
    void sum(int a, int b, int c) {
        System.out.println("세 가지의 수를 더할 수 있는 메서드의 값은: "+(a+b+c));
    }
    void sum(double a, double b) {
        System.out.println("두 가지의 실수를 더할 수 있는 메서드의 값은: "+(a+b));
    }
    public static void main(String[] args) {
        OverloadingExam result = new OverloadingExam();
        result.sum(10, 20);
        result.sum(10, 20, 30);
        result.sum(3.14, 3.14);

    }
}
