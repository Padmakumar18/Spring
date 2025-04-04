package org.pk;

public class Student {
    private int age;
    public Student() {
        System.out.println("Object created...");
    }
    public void show() {
        System.out.println("Showing...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
