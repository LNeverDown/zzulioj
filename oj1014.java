package zzulioj;

import java.util.Scanner;

public class oj1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double p = (a + b + c) / 2;
        Double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("%.2f", S);
    }
}
