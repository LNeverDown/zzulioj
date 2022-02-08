package zzulioj;
import java.util.Scanner;

public class oj1007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int heads = sc.nextInt();
        int feet = sc.nextInt();
        int a = (feet-heads*2)/2;
        int b = heads - a;
        System.out.println(b+" "+a);
    }
}