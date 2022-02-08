package zzulioj;

import java.util.Scanner;

public class oj1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b) {
            int i = a;
            if (i >= c && c >= b) {
                System.out.println(a + " " + c + " " + b);
            } else if (i >= c && c < b) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        }
        if (a < b) {
            int i = b;
            if (i >= c && c >= a) {
                System.out.println(b + " " + c + " " + a);
            } else if (i >= c && c < a) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}

