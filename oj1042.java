package zzulioj;

import java.util.Scanner;

public class oj1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int x = 1;
        for (int i = 0; i <= n; i++) {
            sum += 1.0 * i / (2 * i - 1) * -x;
            x = -x;
        }
        System.out.printf("%.3f", sum);
    }
}
