package Lecture20; class dd{}

class OuterClass{
    private int outerNumber = 10;
    static int outerStaticNumber = 3;
       
    public  int getTotal(){
        InnerClass innerObj = new InnerClass();
        return innerObj.getSum();
    }
    
    public class InnerClass{
        int innerNumber = 5;
        //static int id; // Compilation error
        int getSum(){
            return outerStaticNumber + outerNumber + innerNumber;
        }
    }  
}

public class InstanceInnerClass {
    
    public static void main(String[] args) {
        
        OuterClass outerObj = new OuterClass();
        System.out.println(outerObj.getTotal());
        
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        System.out.println(innerObj.getSum());
    }
}
