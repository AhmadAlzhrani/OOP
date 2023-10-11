package Lecture15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedException {
    
    public static void main(String[] args) {
       myMethod();
    }
    
    
    public static void myMethod() {
        
       try{ FileReader file = new FileReader("somefile.txt");}
       catch(FileNotFoundException e){
            System.out.println("Email");
        }
    
    }
    
    
  
    
//    public static void readData(){
//      
//        File myObj = new File("filename.txt");
//        Scanner myReader = new Scanner(myObj);
//        while (myReader.hasNextLine()) {
//          String data = myReader.nextLine();
//          System.out.println(data);
//        }
//        myReader.close();
//    }
    
    
    public static void readData2() 
            throws FileNotFoundException{
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
    }
    
    public static void readData3(){
      try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
       } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
       }
    }
    
     
}

