package chapter02.inheritance;

public class Parent {

    public String familyName = "김";
    public int honor = 10;

    Parent () {
        System.out.println("부모 생성자");
    }

    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + "가문은 대대로...");
    }

}
