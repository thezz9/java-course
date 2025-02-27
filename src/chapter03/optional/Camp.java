package chapter03.optional;

import java.util.Optional;

public class Camp {

    // 속성
    private Student student;

    // 생성자


    // 기능
    // Optional을 사용해 Null이 반환될 수 있음을 표시
    public Optional<Student> getStudent() {
        return Optional.ofNullable(student);
        // return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
