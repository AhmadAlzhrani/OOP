package Lecture15;
public class ChainedExceptionDemo {
   public final  int X;
  
  public static  void main(String[] args) {
      
     
    try {
      method1();
    }
    catch (Exception ex) {
     
      
      
//      StackTraceElement elements[] = ex.getStackTrace();
//        for (int i = 0; i< elements.length;  i++) {       
//            System.err.println(elements[i].getClassName() + ":" 
//	           + elements[i].getLineNumber() 
//		   + ">> " 
//		   + elements[i].getMethodName() + "()"
//                  );
//    }
  }
    
  }

  public static void method1() throws Exception {
    try {
      method2();
    }
    catch (Exception ex) {
      throw new Exception("New info from method1", ex);
    }
  }

  public static void method2() throws Exception {
    throw new Exception("New info from method2");
  }

    public ChainedExceptionDemo() {
        this.X = 10;
    }
}