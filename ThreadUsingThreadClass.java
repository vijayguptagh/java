import java.lang.Thread;
class A extends Thread{
    //overriding abstract method run of Thread class
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println("Thread A "+i);
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println("Thread A "+i);
    }
}
class ThreadUsingThreadClass{
    public static void main(String[] args) {
        A o1=new A();
        B o2=new B();
        o1.start();
        o2.start();
    }
}