package zzulioj;

import java.util.Scanner;

public class oj1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 20) {
            long x = 1;
            for (int i = 1; i <= n; i++) {
                x = x * i;
                System.out.printf("%-4d%-20d\n", i, x);
            }
        }
    }
}
