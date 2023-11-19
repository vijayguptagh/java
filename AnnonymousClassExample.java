class Greeting{
    public void f1(){ System.out.println("Hello no1");}
    public void f2(){ System.out.println("Hello no2");}
}
class India{
    Greeting g=new Greeting(){
        public void f1(){System.out.println("Namaste");}
    };
}
public class AnnonymousClassExample {
    public static void main(String[] args) {
        India i=new India();
        i.g.f1(); 
        i.g.f2();  
    }   
}
