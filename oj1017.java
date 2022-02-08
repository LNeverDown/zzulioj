package zzulioj;

import java.util.Scanner;

public class oj1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a < 1 || a > 99999) {
            System.out.println("输入有误，请输入一个不多于五位数的正整数");
            a = sc.nextInt();
        }
        if (a < 10) {
            System.out.println(1);
        } else if (a < 100) {
            System.out.println(2);
        } else if (a < 1000) {
            System.out.println(3);
        } else if (a < 10000) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}
//这有个大佬的代码很牛
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.println(a.length());
    }
}
 */