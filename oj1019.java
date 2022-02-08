package zzulioj;

import java.util.Scanner;

public class oj1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a<0){
            a = sc.nextInt();
        }
        if (a<30){
            System.out.println(a * 50);
        }else{
            System.out.println(a * 48);
        }
    }
}
