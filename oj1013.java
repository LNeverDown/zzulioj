package zzulioj;
import java.util.Scanner;

public class oj1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x1 = sc.nextDouble();
        while (x1<0||x1>100){
            x1 = sc.nextDouble();
        }
        Double y1 = sc.nextDouble();
        while (y1<0||y1>100){
            y1 = sc.nextDouble();
        }
        Double x2 = sc.nextDouble();
        while (x2<0||x2>100){
            x2 = sc.nextDouble();
        }
        Double y2 = sc.nextDouble();
        while (y2<0||y2>100){
            y2 = sc.nextDouble();
        }

        double d2 = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        double d = Math.sqrt(d2);
        System.out.printf("%.2f",d);
    }
}
