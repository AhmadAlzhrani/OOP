package Lecture20;

interface Subscribable{
    void setNumber(int number);
    int getNumber();
}

class Company{
    int x;
    Company(){
        sub1.setNumber(5300);
        sub2.setNumber(5400);  
    }
    
    Subscribable sub1 = new Subscribable() {
        private int number;
        @Override
        public void setNumber(int number) {
            this.number = number;
            x = 10;
        }

        @Override
        public int getNumber() {
          return this.number;
        }
    };  
    
    Subscribable sub2 = new Subscribable() {
      private int number;
      @Override
        public void setNumber(int number) {
          this.number = number;
        }

      @Override
      public int getNumber() {
          return this.number;
           }
    };  
    
    void printSubscribers(){
        System.out.println(sub1.getNumber());
        System.out.println(sub2.getNumber());
    }
}
public class Anonymous02 {
    public static void main(String[] args) {
        Company subObj = new Company();
        subObj.printSubscribers();
    }
}
