package zzulioj;
import java.util.Scanner;

public class oj1006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        for (int i = a; i <=b ; i+=c) {
            sum+=i;
        }
        System.out.println(sum);
    }
}