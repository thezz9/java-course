package chapter03.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Camp camp = new Camp();

        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent();

        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

        /* 1. Student = null
        Student student = camp.getStudent();
        System.out.println("student = " + student);

        // 직접적인 null 처리 방법
        String studentName;
        if (student != null) {
            studentName = student.getName();
        } else {
            System.out.println("등록된 학생이 아닙니다.");
        }

        // 2. NullPointerException
        studentName = student.getName();
        System.out.println("studentName = " + studentName);
        */



    }
}
