import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import javax.annotation.processing.FilerException;

public class createNewFile {
     public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try{
      // File fo=new File("My File.java"); //-> I already created this file check once .
      File fo=new File("My File.txt");
      fo.createNewFile();
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
    try{
      FileWriter fw=new FileWriter("My File.txt");
      fw.write("hello world this is new file text !"); // ->  here what written that will print in the file text.we can also write any language like hindi or telugu if you want to try download in google and copy here it will show in file text .
      fw.close();
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
    // it readed the message inside what we created file.text and gives here output.
    try{
      BufferedReader br=new BufferedReader(new FileReader("My File.txt"));
       while(br.ready()){
        System.out.println(br.readLine());
       }
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
//if we want to delete file we can do this here
// try{
//       File fo=new File("My File.txt");
//       fo.createNewFile(); -> create new file.
//      if(fo.delete()){
//      System.out.println(fo.getName());  ->  it will deleted and show in output what we deleted file name. 
//      }
//     }catch(IOException e){
//       System.out.println(e.getMessage());
//     }