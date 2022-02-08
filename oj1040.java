package zzulioj;

import java.util.Scanner;

public class oj1040 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Double sum=0.0,m=1.0;
        for (Double i = 0.0; i<n ; i++){
            sum += 1.0/m;
            m+=2;
        }
        System.out.printf("%.2f",sum);
    }
}
