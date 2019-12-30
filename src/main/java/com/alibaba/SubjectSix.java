package com.alibaba;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: ACM
 * @description: none
 * @author: tongkai yin
 * @create: 2019/12/30 13:38
 * 火柴游戏
 * 火柴总数21
 * 人取的数+电脑的=5
 * 人先取电脑取 21-5-5-5-5=1
 */
public class SubjectSix {
    public static void main(String[] args) {
        int sum = 21;
        System.out.printf("火柴总数：%d\n", sum);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int in;
        int compute;
        while (sum != 0) {
            System.out.println("请输入人取走的根数：");
            in = scanner.nextInt();
            if (in > 4 || in <= 0 || sum - in < 0) {
                System.out.println("错误，请重新输入：");
                continue;
            }
            System.out.println("电脑取走的根数："+(5-in));
            if (sum - 5 == 1) {
                System.out.println("剩余火柴的根数:1");
                System.out.println("电脑WIN");
                break;
            }else{
                sum -= 5;
                System.out.println("剩余火柴的根数："+sum);
            }
        }

    }
}