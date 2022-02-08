package zzulioj;

import java.util.Scanner;

public class oj1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 2) {
            if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
                System.out.println(29);
            } else {
                System.out.println(28);
            }
        } else {
            switch (b) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println(31);
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println(30);
                    break;
            }
        }
    }
}
