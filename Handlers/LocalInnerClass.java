package Lecture20; class ddd{}

class MyClass{
    String course = "ICS108";
   
    public void method(){
         int id = 10;
        //static num;  // Compilation error
        class InnerLocal{
            public void print(){
                System.out.println(id);
                System.out.println(MyClass.this.course);
            }     
        }
        
         InnerLocal localObj = new InnerLocal();    
         localObj.print();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        
       myObj.method();
    }
}


