package chapter02.capsulation.v1;

public class DataStore {

    // "B" 문자열이 들어오면 핵폭발 발생
    private String store;

    // 무분별한 Setter (의미 X) 해결
    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B가 입력되면 안 됩니다.");
        } else {
            this.store = store;
        }

    }
}
