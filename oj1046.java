package zzulioj;

import java.util.Scanner;

public class oj1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 1;
        for (int i = 0; i < a; i++){
            int b =sc.nextInt();
            if(b%2!=0){
                x= x * b;
            }
        }
        System.out.println(x);
    }
}
