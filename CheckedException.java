import java.io.*;
class CheckedEXception{
    public static void main(String[] args) throws IOException{
        System.out.println("no compile time error bcz exc handled now");
        //throw new IOException();
        //System.out.println("the end");
        //default catch user throw-so after throw statement program stops it gives compile time error
        //in case of trycatch after throw program dont ends
        try {
            throw new IOException();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("after exception program continues in try catch");
    }
}