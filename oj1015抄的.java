package zzulioj;
import java.util.*;
public class oj1015抄的 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String s1,s2;
        s1=input.nextLine();
        String a1[]=s1.split(":");
        int x1=Integer.parseInt(a1[0]);
        int y1=Integer.parseInt(a1[1]);
        int z1=Integer.parseInt(a1[2]);
        s2=input.nextLine();
        String a2[]=s2.split(":");
        int x2=Integer.parseInt(a2[0]);
        int y2=Integer.parseInt(a2[1]);
        int z2=Integer.parseInt(a2[2]);
        int sum=(z2-z1)+(y2-y1)*60+(x2-x1)*3600;
        System.out.println(sum);
    }
}