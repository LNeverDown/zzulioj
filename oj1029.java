package zzulioj;

import java.util.Scanner;

public class oj1029 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>0&b>0&c>0) {
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }else {
            System.out.println("No");
        }
    }
}
