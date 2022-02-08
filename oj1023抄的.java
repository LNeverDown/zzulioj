package zzulioj;
import java.util.Scanner;

public class oj1023抄的 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=s.charAt(0);

        if(Character.isLowerCase(c))
            System.out.println(Character.toUpperCase(c));
        else
            System.out.println(c);

    }
}
