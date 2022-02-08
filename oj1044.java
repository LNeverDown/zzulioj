package zzulioj;

import java.util.Scanner;

public class oj1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        int lv1 = 0;
        Double x = sc.nextDouble();
        if (x < 60) {
            lv1++;
        }
        for (int i = 1; i < a; i++) {
            Double y = sc.nextDouble();
            if (y < 60) {
                lv1++;
            }
        }
        System.out.printf("%.2f",lv1/a);
    }
}
