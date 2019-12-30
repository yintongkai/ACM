package com.alibaba;

/**
 * @program: ACM
 * @description: none
 * @author: tongkai yin
 * @create: 2019/12/29 23:21
 * 有个电子钟，12点显示为12:00（即12小时制），那么请问一天24时间内，出现连续3个相同数字的钟点有几个？
 */
public class SubjectTwo {
    public int[] splitTime(int time) {
        int[] arr = new int[4];
        int count = 3;
        while (count>=0) {
            arr[count]=time%10;
            time = time / 10;
            count--;
        }
        return arr;
    }

    public boolean filterTime(int[] arr) {
        if(arr[0]==arr[1]&&arr[1]==arr[2])
        return true;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
            return true;
        else
            return false;
    }

    public boolean checkTime(int time) {
        if (time>1259) {
            return false;
        }
        else {
            int h = time / 100;
            int m = time - h * 100;
            return (h <= 12 && m <= 59&&h>0) ? true : false;
        }
    }
    public static void main(String[] args) {
        SubjectTwo subjectTwo = new SubjectTwo();
        int time = 1270;
        while (time > 0) {
            if (subjectTwo.checkTime(time)) {
                if (subjectTwo.filterTime(subjectTwo.splitTime(time))) {
                    System.out.println(time);
                }
            }
            time--;
        }
    }
}