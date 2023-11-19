class GenericMethod{
    /*when not generic method
    public void print(String s[]){
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
    public void print(Number n[]){
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }*/
    public <E> void print(E a[]){    //return type E like string  and argument E a[] like String s[]
        for(E x:a)
            System.out.println("Elements are as : "+x);  
    } 
    public static void main(String[] args) {
        GenericMethod g=new GenericMethod();
        String s[]=new String[]{"India","UK","Russia"};
        Number n[]={12,23,18,45};  //number class defined in java.lang.number
        g.print(s);
        g.print(n);
    } 

}