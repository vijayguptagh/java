//type conversion

class TypeConversionExamples{
    public static void main(String args[]){
        //to clr screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
                       
        //widening conversion allowed-implicit conversion
        int a=2;
        float b=a;
        System.out.println("b = "+b);
        
        //narowwing conversion not allowed
        float c=3.14f;
        /*int d=c;
        System.out.println("d = "+d);*/
        
        //typecasting -explicit conversion
        System.out.println("b = "+(float)a);
        System.out.println("d = "+(int)c);


    }
}   
        
        
        
        
        
