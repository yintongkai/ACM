package com.alibaba;

/**
 * @program: ACM
 * @description: none
 * @author: tongkai yin
 * @create: 2019/12/29 22:30
 */
public class SubjectOne {
    public static int count=0;

    public int Fib(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return Fib(num - 2) + Fib(num - 1);
        }
    }

    public void printChar(int sum) {
        char c = 'A';
        char b = (char)(Integer.valueOf(c)+count);
        boolean flag = true;
        while (flag) {
            System.out.print(b);
            sum--;
            if (sum == 0) {
                break;
            }
        }
        System.out.println();
        count++;
    }

    public static void main(String[] args) {
        SubjectOne subjectOne = new SubjectOne();
        int count = 1;
        while (true) {
            int sum = subjectOne.Fib(count);
            subjectOne.printChar(sum);
            count++;
            if (count > 10) {
                break;
            }
        }
    }
}