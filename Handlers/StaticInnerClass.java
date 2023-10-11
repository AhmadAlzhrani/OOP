
package Lecture20; class fff{}

class Outer{
    int id = 10;
    static int number = 20;
    
   static class Inner1{
        static int n1;
        int n2;
        void printInfo1(){
            //System.out.println(id); // Complation error
            System.out.println(number);
        }
        
        static void printInfo2(){
            //System.out.println(id); // Complation error
            System.out.println(number);
        }
    }
}

public class StaticInnerClass {
    
    public static void main(String[] args) {
     //Outer outerObj = new Outer();
     // outerObj.new // can not applied
     
     Outer.Inner1.printInfo2();

     Outer.Inner1 innerObj1 = new Outer.Inner1();
     innerObj1.printInfo1();
    }
}
