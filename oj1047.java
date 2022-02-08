package zzulioj;

import java.util.Scanner;

public class oj1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        if (a <= b) {
            for (int i = 0; i <= b - a; i++) {
                System.out.printf("%4d%8.4f\n", c, Math.log(c));
                c++;
            }
        }
    }
}
