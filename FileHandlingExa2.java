import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
//using FileOutStream
class FileHandlingExa2{
    public static void main(String[] args) throws IOException{
        System.out.println("fileoutputstream : ");
        //if you want to append-true else false or dont pass boolean argument
        FileOutputStream f1=new FileOutputStream("C:/Vijay/Coding/java/file1.txt",false);        
        System.out.print("enter text to write in file : ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char c[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
            f1.write(c[i]);
        f1.close();

        System.out.println("bufferedwriter");
        System.out.print("enter text to write in file : ");
        BufferedWriter f2=new BufferedWriter(new FileWriter("C:/Vijay/Coding/java/file2.txt",true));
        String s2=sc.nextLine();
        f2.write(s2);
        f2.close();
    }
}