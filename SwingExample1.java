//by creating object of JFrame class
import javax.swing.*;
public class SwingExample1{
    public static void main(String[] args) {
        JFrame jf1=new JFrame("Project 1");
        //to show frame 
        jf1.setVisible(true);
        //esse terminal pe program ka execution kabhi end nhi hota h so  addclose method
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//calling static member of jframe
        //now frame ke exit button se exit karne par execution of program stops
        //size is so less it is default size so set size as
        jf1.setSize(300,300);
    }
}   
//by extending JFrame class and creating object of child class
/*
import javax.swing.*;
public class SwingExample1{
    public SwingExample1(String e){ super(e);}
    public SwingExample1(){} 
    //default cons defination required bcz here we have defined con taking a arg so java doesn't creates this automatically 
    public static void main(){
        JFrame jf2=new JFrame("Project 2");
        jf2.setVisible(true);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf2.setSize(300,300);   
    }
}
*/