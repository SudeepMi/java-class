package FileHandling;

import java.io.*;


/**
 *
 * @author cws
 */
public class WriteFile {
     public static void main(String[] args){
        try {
            FileWriter wr = new FileWriter("/home/cws/Desktop/myFile.txt");
            wr.write("Hello from java");
            wr.close();
            WriteFile.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     
     static void read(){
        try {
            FileReader wr = new FileReader("/home/cws/Desktop/myFile.txt");
            int i;
            while((i=wr.read())!=-1){
                System.out.print((char)i);
            }
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
