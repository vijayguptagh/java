import java.util.Scanner;
class box {
    int length,breadth,height;
    public box(){
        length=1;
        breadth=10;
        height=100;
    }    
    public void setvalues(int l,int b,int h) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length = ");
        length=sc.nextInt();
        System.out.print("enter breadth = ");
        breadth=sc.nextInt();
        System.out.print("enter height = ");
        height=sc.nextInt();
     }
     public void getvalues(){
         System.out.println("length = "+length+"\n"+"breadth = "+breadth+"\n"+"height = "+height);
     }     
}
class CreateBox{
    public static void main(String args[]){
        box b1=new box();
        b1.getvalues();
        //values 2,4,6 taken bcz without values constuctor calling not possible
        b1.setvalues(1,2,3); 
        b1.getvalues();
    }      
}        
        
        
                     