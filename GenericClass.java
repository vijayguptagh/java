class MyClass<T>{
    T n;
    public void add(T x){n=x;}
    public T get(){return n;}
}
public class GenericClass{
    public static void main(String[] args) {
        MyClass<String> m=new MyClass<String>();
        MyClass<Number> n=new MyClass<Number>();
        //String and Number data type ke lie diff object banaya h lekin 1 hi class h
        m.add("Mitchel");
        n.add(30);
        System.out.println("m = "+m.get()+" n = "+n.get());
    }  
}
   