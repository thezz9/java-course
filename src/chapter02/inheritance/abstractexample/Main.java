package chapter02.inheritance.abstractexample;

public class Main {
    public static void main(String[] args) {

        // 추상 클래스는 인스턴스화 할 수 없다.
        // Animal animal = new Animal();

        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        cat.eat();

        // 모든 클래스는 Object를 상속받기 때문에 equals와 같은 메서드를 사용 가능

    }
}
