package com.alibaba;

/**
 * @program: ACM
 * @description: none
 * @author: tongkai yin
 * @create: 2019/12/30 12:09
 * 10进制：2992 2+9+9+2=22
 * 12进制：1894 1+8+9+4=22
 * 16进制：BB0 11=11+0=22
 */
public class SubjectThree {
    public int[] toDecimal(int number) {
        int[] tmp = new int[4];
        int count = 3;
        while (count>=0) {
            tmp[count] = number % 10;
            number = number / 10;
            count--;
        }
        return tmp;
    }
    public int[] toDuodecimal(int number) {
        int[] tmp = new int[4];
        int count = 3;
        while (count>=0) {
            tmp[count] = number % 12;
            number = number / 12;
            count--;
        }
        return tmp;
    }

    public int[] toHexdecimal(int number) {
        int[] tmp = new int[4];
        int count = 3;
        while (count>=0) {
            tmp[count] = number % 16;
            number = number / 16;
            count--;
        }
        return tmp;
    }

    public int sum(int[] ints) {
        int sum = 0;
        for (int i:
             ints) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        SubjectThree subjectThree = new SubjectThree();
        for (int i = 1000; i <9999 ; i++) {
            int m = subjectThree.sum(subjectThree.toHexdecimal(i));
            int n = subjectThree.sum(subjectThree.toDuodecimal(i));
            int l = subjectThree.sum(subjectThree.toDecimal(i));
            if (m == n&&n == l) {
                System.out.println(i);
            }
        }
    }
}