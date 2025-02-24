package chapter01.variable;

public class Main {
    public static void main(String[] args) {

        // 논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);

        // 문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 정수형 (byte)
        byte byteBox = 1;
        byteBox = 2;
        System.out.println("byteBox = " + byteBox);

        // 정수형 (short)
        short shortBox = 1;
        shortBox = 2;
        System.out.println("shortBox = " + shortBox);

        //정수형 (int)
        int intBox = 1;
        intBox = 2;
        System.out.println("intBox = " + intBox);

        // 실수형 (float)
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f;
        System.out.println("floatBox = " + floatBox);

        // 실수형 (double)
        double doubleBox = 0.12345678901234567;
        doubleBox = 0.123456789012345678;
        System.out.println("doubleBox = " + doubleBox);

        // 다운캐스팅 (명시적 형 변환)
        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println(smallBox);

        // 업캐스팅 (묵시적 형 변환)
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println(bigBox2);

    }
}