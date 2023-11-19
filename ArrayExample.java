//program to take input for a array
import java.util.Scanner;
class ArrayExample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter size of array = ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements of array = ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.println("a["+i+"]"+"="+a[i]);
    }
}