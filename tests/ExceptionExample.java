package Lecture15;
public class ExceptionExample {
    
    public static void ArrayExceptionExample(){
        int[] array ={1,3,5,7,9,8};
        try{
            for(int i = -1; i<= 6; i++)
                System.out.println(array[i]);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
        }   
    }
    
    public static void ArithmeticExceptionExample(){
        int x = -0;
        double y = 0.0;
        System.out.println(x/y);
    }
    
    public static void main(String[] args) {
        ArrayExceptionExample();
        
    }
    
    
}
