package zzulioj;

import java.util.Scanner;

public class oj1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b) {
            int i = a;
            if (i >= c) {
                System.out.println(i);
            } else {
                System.out.println(c);
            }
        }
        if (a < b) {
            int i = b;
            if (i >= c) {
                System.out.println(i);
            } else {
                System.out.println(c);
            }
        }
    }
}
