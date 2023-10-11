
package Lecture15;

import java.util.InputMismatchException;

public class FinallyExample {
    public static void main(String[] args) {
        int result = compute3();
        System.out.println(result);
    }
    
    public static int compute1(){
        int x = 0;
        try{
             x = 10 / 1;  //0
             System.out.println("Try blcok");
        }catch(Exception e){
            System.out.println("Catch block");
        }finally{
            System.out.println("Finally block");
        }
        System.out.println("End of method");
        return x;
    }
    
    public static int compute2(){
        int x = 0;
        try{
             x = 10 / 1;  // 0
             System.out.println("Try blcok");
             return x;
        }catch(Exception e){
            System.out.println("Catch block");
            return 9;
        }finally{
            System.out.println("Finally block");
        }
    }
    
     public static int compute3(){
        int x = 0;
        try{
             x = 10 / 0;  // 0
             System.out.println("Try blcok");
             return x;
        }catch(InputMismatchException e){
            System.out.println("Catch block");
            return 9;
        }finally{
            System.out.println("Finally block");
        }
    }
    
}
