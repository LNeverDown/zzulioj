package zzulioj;

import java.util.Scanner;

public class oj1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 & b > 0 & c > 0) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }else {
            System.out.println("no");
        }
    }
}
