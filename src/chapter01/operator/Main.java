package chapter01.operator;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a + b;
        System.out.println("mul = " + mul);

        // 나눗셈
        // 10 / 3
        int div = a / b;
        System.out.println("div = " + div);

        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);

        // 모듈러 연산자 (나머지 연산)
        int mod = a % b;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);

        // 시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);

        // 짝수 홀수 연산
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);

        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);

        // 대입 연산자
        int num = 5;

        // 복합 대입 연산자
        num += 3; // num = num + 3;
        System.out.println("num = " + num);

        num -= 2;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 3;
        System.out.println("num = " + num);

        num %= 3;
        System.out.println("num = " + num);

        // 증감 연산자
        num = 1;
        num++;
        num++;
        num--;
        num--;
        System.out.println("num = " + num);
        
        // 전위 연산 (++i)
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));
        
        // 후위 연산 (i++)
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);

        // 비교 연산자
        System.out.println("10 == 10: " + (10 == 10));

        // 다름 연산자
        System.out.println("10 != 10: " + (10 != 5));

        // 크기 비교 연산자
        System.out.println("10 < 5: " + (10 < 5));
        System.out.println("10 >= 10: " + (10 >= 10));
        System.out.println("10 <= 5: " + (10 <= 5));

        // 논리 연산자
        System.out.println("ture && ture: " + (true && true)); // true
        System.out.println("ture && false: " + (true && false)); // false
        System.out.println("ture || ture: " + (true || true)); // true
        System.out.println("false || ture: " + (false || true)); // true
        System.out.println("!true: " + (!true)); // false

        int age = 20;
        boolean isStudent = true;
        System.out.println("::: " + ((age > 18) && isStudent));

        // 연산자 우선순위
        // 증감 > 산술 > 시프트 > 관계 > 비교 > 논리 > 삼항 > 대입
    }
}
