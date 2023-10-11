package Lecture15;
public class Test {
    
    public static void main(String[] args) {    
     try{
        test("ICS104.txt");
        test(null);
        test("ICS108.txt");
    }catch(IllegalArgumentException ex){
         System.out.println(ex.toString());  
     }
    }
    
    public static void test(String fileName){
        if(fileName==null)
            throw new IllegalArgumentException("Invalid ");
        else
            System.out.println(fileName);
    }
}
