package Lecture16;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileStreamsDownload {

    public static void main(String[] args)  {
    String URLString =
    "https://faculty.kfupm.edu.sa/COE/mudawar/"
            + "coe202/202/COE%20202-Syllabus-T202.pdf";
    //"http://www.kfupm.edu.sa/HomePagebanner/home-banner-img_v01.jpg";
    try {
      java.net.URL url = new java.net.URL(URLString); 
      int count = 0;
      InputStream input = url.openStream();
      String newFileName;
      newFileName = "src/Lecture16/files/" + 
              URLString.substring(URLString.lastIndexOf("/")+1);
      System.out.println(newFileName);
      
      File targetFile = new File(newFileName);
      try (OutputStream outputStream = new FileOutputStream(targetFile);){
      int length;
      byte[] buffer = new byte[1024];// buffer for portion of data from connection
      while ((length = input.read(buffer)) > -1) {
            outputStream.write(buffer, 0, length);
            count+=length;
        }
    }
      System.out.println("The file size is " + count/1024.0 + " KB");
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    }catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
  }
}   