package chapter02.clazz;

public class Person {

    // 속성 - 변수
    String name;
    int age;
    String address;

    // 생성자
    // 클래스와 이름이 같다. 반환 타입이 존재하지 않는다. 여러 개가 존재할 수 있다.
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 기능 - 메서드
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // getter
    String getName() {
        return this.name;
    }

    // setter
    void setAddress(String address) {
        this.address = address;
    }

}
