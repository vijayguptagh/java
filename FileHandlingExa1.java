import java.io.IOException;
import java.io.File;

class FileHandlingExa1{
    public static void main(String[] args) throws IOException {
        //note that before executing check that this file doesn't exist already given location

        //here object of File(our prog class) is created in program that means in RAM
        File f=new File("C:/Vijay/Coding/java/file.txt");
        System.out.println("before file creation : ");
        //since metadatafile is not created in disk(HDD) it doesn't exist
        System.out.println("Is File Exist : "+f.exists());
        System.out.println("Name Of File : "+f.getName());
        //since object is in RAM it is not writtable
        System.out.println("Is File Writtable : "+f.canWrite());
        System.out.println("Length of File : "+f.length());

        //to create metadata.txt file on given location
        f.createNewFile();
        //file in hdd is existing and and it is writtable bcz not in RAM
        System.out.println("after file creation : ");
        System.out.println("Is File Exist : "+f.exists());
        System.out.println("Is File Writtable : "+f.canWrite());   
     }
}









