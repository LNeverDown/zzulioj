package zzulioj;

import java.util.Scanner;

public class oj1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        if(a<500){
            System.out.printf("%.2f",a);
        }else if(a<1000){
            System.out.printf("%.2f",a*0.95);
        }else if(a<3000){
            System.out.printf("%.2f",a*0.9);
        }else if (a<5000){
            System.out.printf("%.2f",a*0.85);
        }else {
            System.out.printf("%.2f",a*0.8);
        }
    }
}
