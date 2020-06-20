package org.ITA;

/**
 * @ProjectName: JavaOOP
 * @Package: org.ITA
 * @ClassName: Main
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/6/20 2:56 下午
 * @Version:
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(24);
        student.setGender(0);
        student.setId("ITA0001");
        student.setNames("henry");
        student.setNo(1);
        System.out.println(student);
    }
}
