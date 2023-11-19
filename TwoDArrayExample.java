import java.util.Scanner;
public class TwoDArrayExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.print("enter no of rows in array = ");
        m=sc.nextInt();
        System.out.print("enter no of columns in array = ");
        n=sc.nextInt();
        int array[][]=new int[m][n];
        System.out.println("Enter elements of array");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                array[i][j]=sc.nextInt();
        System.out.print("elements of array are as = ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                System.out.println(array[i][j]+" ");

    }
}
