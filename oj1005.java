package zzulioj;
import java.util.Scanner;

public class oj1005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%-9d%-9d%-9d\n",a,a*a,a*a*a);
        System.out.printf("%-9d%-9d%-9d\n",b,b*b,b*b*b);
        System.out.printf("%-9d%-9d%-9d\n",c,c*c,c*c*c);
    }
}
        //System.out.printf("%9d%9d%9d",a,b,c);
