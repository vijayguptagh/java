import javax.swing.*;
import java.awt.event.*;
public class SwingExample2 extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public SwingExample2(){}
    public SwingExample2(String e){super(e);}
    public void setComponents(){
        //creating object of components
        l1=new JLabel("Addition of two numbers");
        l2=new JLabel("First number");
        l3=new JLabel("Second number");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Add");
        //adding layout by user
        setLayout(null); //declining default layout setup
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,50,100,20);
        l3.setBounds(50,130,100,20);
        l4.setBounds(50,240,200,20);
        t1.setBounds(150,80,100,20);
        t2.setBounds(150,130,100,20);
        b1.setBounds(80,180,100,20);
        //to add components in frame
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        //to handle event when we click on sum button
        b1.addActionListener(new Handler());
    }
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int s=a+b;
            l3.setText("Result is "+s);
        }
    }
    public static void main(String[] args){
        JFrame jf=new JFrame("Project 2");
        jf.setComponents();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300,300);   
    }    
}
