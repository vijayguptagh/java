

class DefaultException{
    public static void main(String []args){
    //1.default
        System.out.println("Exception = "+5/0);

        String s2=null;
        System.out.println("Exception in s2 = "+s2);
        //runtime error-unchecked exception
        //bcz compilation hua(s1 ko null value mila) but runtime par error aya
        /*when we use s1.length()-Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
                                  at ExceptionHandling.main(ExceptionHandling.java:7)*/

        /*String s1;
        System.out.println(s1);  //s1 or s1.length()*/
        //compile time error-checked exception
        //ek string jisme koi value nhi uska length undefined h
        //bcz at compile time s1 ko jab memmory dena tha tab usme no value==>by default value 0 in java(in c garbage)
    }
}