package zzulioj;

import java.util.Scanner;

public class oj1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (Math.abs(a) >= Math.abs(b)) {
            if (Math.abs(b) >= Math.abs(c)) {
                System.out.println(a);
            } else {
                if (Math.abs(a) >= Math.abs(c)) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            }
        }else {
            if (Math.abs(a)>=Math.abs(c)){
                System.out.println(b);
            }else {
                if (Math.abs(b)>=Math.abs(c)){
                    System.out.println(b);
                }else {
                    System.out.println(c);
                }
            }
        }
    }
}