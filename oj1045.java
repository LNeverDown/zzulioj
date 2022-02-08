package zzulioj;

import java.util.Scanner;

public class oj1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int x=0,y=0,z=0;
        for (int i =0;i<a;i++){
            int b = sc.nextInt();
            if (b<0){
                x++;
            }else if(b==0){
                y++;
            }else {
                z++;
            }
        }
        System.out.println(x+" "+y+" "+z);
    }
}
