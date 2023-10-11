package Lecture20; class pp{}

class OuterA{
    private int id = 10;
            int width = 9;
            int length = 10;
    
    int getWidth(){return width;  }
    public int getTotal(){
        
        InnerA innerObj = new InnerA();
        // num = 10;
        return  innerObj.num + innerObj.getSum();
    }
    
    public class InnerA{
        public int num = 8;
        int id = 5;
        //static int id; // Compilation error
        int getSum(){
            int id = 7;
            return  id + this.id + OuterA.this.id + length + getWidth();
        }
    }
    
     public class InnerB{
        public int num = 8;
        int getSum(){
            return  (new OuterA.InnerA()).num;
        }
    }
}

public class InstanceInnerClassQuiz01 {
    
    public static void main(String[] args) {
        
        OuterA outerObj = new OuterA();
        System.out.println(outerObj.getTotal());
    }
}

