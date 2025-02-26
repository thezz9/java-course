package chapter02.capsulation;

public class Person {

    // 속성
    private String name;
    private String secert;

    // 생성자
    public Person(String name, String secert) {
        this.name = name;
        this.secert = secert;
    }

    // 기능
    public void methodA() {}
    private void methodB() {}

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

}
