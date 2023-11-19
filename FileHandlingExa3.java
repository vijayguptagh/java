import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
public class FileHandlingExa3 {
    public static void main(String[] args) throws IOException{
        //before executing check that file3 exist.
        int i;
        System.out.println("with fileinputstream");
        System.out.print("text in file1 is : ");
        FileInputStream f1=new FileInputStream("C:/Vijay/Coding/java/file1.txt");
        while((i=f1.read())!=-1)
            System.out.print((char)i);
        f1.close();

        System.out.println("\n");
        System.out.println("bufferedreader");
        int j;
        System.out.print("text in file2 is : ");
        BufferedReader f2=new BufferedReader(new FileReader("C:/Vijay/Coding/java/file2.txt"));
        while((j=f2.read())!=-1)
            System.out.print((char)j);
        f2.close();

    }    
}
