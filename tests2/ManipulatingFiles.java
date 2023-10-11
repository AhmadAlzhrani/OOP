
package Lecture16;

import java.io.File;
import java.io.IOException;

public class ManipulatingFiles {
    
    public static void main(String[] args) {
        createFile("src/Lecture16/files/newFile.txt");
        deleteFile("src/Lecture16/files/newFile.txt");
        renameFile("src/Lecture16/files/newFile.txt",
                "src/Lecture16/files/newFile1.txt");
    }
    
    public static void createFile(String fileName){
        File file = new File(fileName);
        try {
          // trying to create a file based on the object
          boolean value = file.createNewFile();
         
          if (value) {
            System.out.println("The new file is created.");
          }
          else {
            System.out.println("The file already exists.");
          }
        }
        catch(IOException e) {
            System.out.println("Probelm.");
        }       
    }
    
    
    public static void deleteFile(String fileName) {	
       File file = new File(fileName);
    
       if(file.delete()){
            System.out.println(file.getName() + " is deleted!");
       }else{
            System.out.println("Delete failed.");
       }
    }
    
    
    public static void renameFile(String oldName, String newName) {	
        File oldfile =new File(oldName);
	boolean flag = oldfile.renameTo(new File(newName));
	if(flag){
            System.out.println("File renamed successfully.");
	}else{
            System.out.println("Rename operation failed.");
	 }
    }
}
