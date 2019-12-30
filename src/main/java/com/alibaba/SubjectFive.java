package com.alibaba;

/**
 * @program: ACM
 * @description: none
 * @author: tongkai yin
 * @create: 2019/12/30 13:27
 * she分别代表三个数字
 * (he)^2=she
 * 求she？
 */
public class SubjectFive {
    public static void main(String[] args) {

        for (int s = 1; s <10 ; s++) {
            for (int h = 0; h <10;h++) {
                for (int e = 0; e <10 ; e++) {
                    if ((h * 10 + e) * (h * 10 + e) == s * 100+h*10+e) {
                        System.out.println(s * 100+h*10+e);
                    }
                }
            }
        }
    }
}