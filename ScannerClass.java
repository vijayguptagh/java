// java program to take input

import java.lang.Math;
import java.util.Scanner;
class ScannerClass {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a = ");
        a=sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("Square root of x = "+Math.sqrt(a));
    }
}        