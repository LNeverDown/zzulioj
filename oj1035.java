package zzulioj;

import java.util.Scanner;

public class oj1035 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        if(x<-2){
            System.out.println(7-2*x);
        }else if(x>=-2&x<3){
            System.out.println(5-Math.abs(3*x+2));
        }else{
            System.out.println(3*x+4);
        }
    }
}
