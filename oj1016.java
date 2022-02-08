package zzulioj;

import java.util.Scanner;

public class oj1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double c = 1.0225;
        while (a < 1) {
            System.out.println("Error,try again.");
            a = sc.nextInt();
        }
        while (a == 1){
            double b = sc.nextDouble();
            System.out.printf("%.6f",b*c);
            break;
        }
        while(a > 1) {
            double b = sc.nextDouble();
            System.out.printf("%.6f", Math.pow(c, a) * b);
            break;
        }
    }
}
