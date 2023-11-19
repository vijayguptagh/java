//since here main class is public and a file can contain only 1 outer class so this cant be default only
class OuterClass{
    static int a=10;
    int b=1;
    //inner class can be any but in case of private inner class object of inner class can be created 
    //inside that inner class only not outside
    public static class StaticInnerClass{
        public void f1(){
            //static class can contain only static members of outer class
            System.out.println("Inside static inner class : a = "+a+" and we can't access b");
        }
    }
    public class NonStaticInnerClass{
        public void f2(){
            //can access static + nonstatic both members of outer class
            System.out.println("Inside nonstatic inner class : a = "+a+" and b = "+b);
        }
    }
}
public class InnerClassExample {
    public static void main(String[] args) {
        //static inner class object creation
        OuterClass.StaticInnerClass o1=new OuterClass.StaticInnerClass();
        o1.f1();

        //Nonstatic inner class object creation
        OuterClass o2=new OuterClass();
        OuterClass.NonStaticInnerClass o3=o2.new NonStaticInnerClass();
        o3.f2();
    }  
}
