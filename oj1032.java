package zzulioj;

import java.util.Scanner;

public class oj1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1500;
        if (a<=10000){
            System.out.printf("%.2f",b+0.05*a);
        }else if(a>10000&&a<=50000){
            System.out.printf("%.2f",b+10000*0.05+(a-10000)*0.03);
        }else {
            System.out.printf("%.2f",b+10000*0.05+40000*0.03+(a-50000)*0.02);
        }
    }
}
