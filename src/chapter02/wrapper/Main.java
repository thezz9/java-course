package chapter02.wrapper;

public class Main {
    public static void main(String[] args) {

        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);

        // 참조형 변수
        Person personA = new Person();
        System.out.println("personA = " + personA);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr = " + arr);

        // wrapper class (기본형 변수를 감싸고 있는 클래스)
        Integer num = 100;
        System.out.println("num = " + num);
        String numStr = num.toString();
        System.out.println("numStr = " + numStr);

        // custom
        CustomInteger myInteger = new CustomInteger(10);
        String myIntegerStr = myInteger.toString();
        System.out.println("myIntegerStr = " + myIntegerStr);

        // AutoBoxing (기본형 -> 래퍼형)
        Integer num3 = 10;
        // Integer num3 = Integer.valueOf(10);

        // AutoUnBoxing (래퍼형 -> 기본형)
        int num4 = num3;
        // int num4 = num3.intValue(10);
    }
}
