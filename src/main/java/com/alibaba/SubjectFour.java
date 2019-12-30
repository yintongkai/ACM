package com.alibaba;

/**
 * @program: ACM
 * @description: none
 * @author: tongkai yin
 * @create: 2019/12/30 13:13
 */
public class SubjectFour {
    private int a=0;
    private int b = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public  void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void main(String[] args) {
        SubjectFour subjectFour = new SubjectFour();
        subjectFour.setA(11);
        subjectFour.setB(111);
        System.out.println(subjectFour.getA());
        System.out.println(subjectFour.getB());
        subjectFour.swap();
        System.out.println(subjectFour.getA());
        System.out.println(subjectFour.getB());
    }
}