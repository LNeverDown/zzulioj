package zzulioj;
import java.util.Scanner;

public class oj1024 {

    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        char c=s.charAt(0);

        if(Character.isLowerCase(c))
            System.out.println(c-96);
        else
            System.out.println(c-64);

    }
}
