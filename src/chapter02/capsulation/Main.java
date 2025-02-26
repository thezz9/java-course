package chapter02.capsulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person("John", "Doe");

        // 인스턴스 변수 접근
        // person.name = "?";
        // person.secret = "?";

        // 인스턴스 메서드 접근
        person.methodA();
        // person.methodB();

        // Getter
        String name = person.getName();
        System.out.println("name = " + name);

        // Setter
        person.setName("Steve");
        String name2 = person.getName();
        System.out.println("name2 = " + name2);

    }
}
