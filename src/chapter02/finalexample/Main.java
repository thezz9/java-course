package chapter02.finalexample;

public class Main {
    public static void main(String[] args) {

        // final
        final int a = 1;
        System.out.println("a = " + a);

        // 상수
        System.out.println("상수 = " + Circle.PI);

        // 불변 객체
        final Circle c1 = new Circle(2);

        // 참조 변경은 막지만 내부상태 변경은 막지 못 함
        // c1 = new Circle(5)
        // c1.radius = 5;

        System.out.println("c1 = " + c1);

        // 불변 객체의 내부상태가 변경이 필요한 경우
        Circle c2 = new Circle(10); // 생성자 활용
        Circle c3 = c2.changeRadius(20); // 기능 활용

    }
}
