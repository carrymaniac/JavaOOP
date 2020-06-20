package org.ITA;

import java.util.Objects;

/**
 * @ProjectName: JavaOOP
 * @Package: org.ITA
 * @ClassName: Student
 * @Author: carrymaniac
 * @Description: 学生类
 * @Date: 2020/6/20 2:54 下午
 * @Version:
 */
public class Student {
    private String names;
    private Integer age;
    private Integer gender;
    private String id;
    private Integer No;

    public Student() {
    }

    public Student(String names, Integer age, Integer gender, String id, Integer no) {
        this.names = names;
        this.age = age;
        this.gender = gender;
        this.id = id;
        No = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "names='" + names + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", No=" + No +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(names, student.names) &&
                Objects.equals(age, student.age) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(id, student.id) &&
                Objects.equals(No, student.No);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names, age, gender, id, No);
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNo() {
        return No;
    }

    public void setNo(Integer no) {
        No = no;
    }
}
