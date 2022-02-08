package zzulioj;

import java.util.Scanner;

public class oj1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int max = x;
        for (int i = 1; i < a; i++) {
            int b = sc.nextInt();
            if (b > max) {
                max = b;
            }
        }
        System.out.println(max);
    }
}
