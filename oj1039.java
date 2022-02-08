package zzulioj;

import java.util.Scanner;

public class oj1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b,sum = 0;
        for (int i = 0;i<a;i++){
            b = sc.nextInt();
            sum+=b;
        }
        System.out.println(sum);
    }
}
