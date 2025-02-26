package chapter01.method;

public class Calculator {

    // 더하기 반환데이터 O
    int sum1(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 더하기 반환데이터 X
    void sum2(int value1, int value2) {
        int result = value1 + value2;
        System.out.println("결과: " + result);
    }

}
