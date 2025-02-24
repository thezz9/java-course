package chapter01.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 출력
        // println
        System.out.println("Hello");
        System.out.println("Java");

        // print
        System.out.print("안녕");
        System.out.print("자바");

        // 개행문자
        System.out.println("Hello\nWorld!");

        // 입력
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        // 정수형 입력받기
        System.out.print("정수(int)를 입력하세요.: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력하세요.: ");
        Long longBox = scanner.nextLong();
        System.out.println("longBox = " + longBox);

        // 실수형 입력받기
        System.out.print("소수점(double)을 입력하세요.: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);

    }
}
