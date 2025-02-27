package chapter03.generic;

public class GenericBox<T> {

    // 속성
    private T item;

    // 생성자
    public GenericBox(T item) {
        this.item = item;
    }

    // 기능
    public T getItem() {
        return this.item;
    }

    // 일반 메서드
    public void printItem(T item) {
        System.out.println("item = " + item);
    }

    // 제네릭 메서드
    public <S> void printBoxItem(S Item) {
        System.out.println("item = " + Item);
    }

}
