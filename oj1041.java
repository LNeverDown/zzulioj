package zzulioj;

import java.util.Scanner;

public class oj1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum1 = 1.0, sum2 = 0.0, x = 3.0, y = 5.0, z = 1.0;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                sum2 += 1/z;
                sum2 -= 1/x;
                z += 4.0;
                x += 4.0;
            }
            System.out.printf("%.2f", sum2);
        } else {
            for (int i = 0; i < n / 2; i++) {
                sum1 -= 1 / x;
                sum1 += 1 / y;
                x += 4.0;
                y += 4.0;
            }
            System.out.printf("%.2f", sum1);
        }
    }
}
