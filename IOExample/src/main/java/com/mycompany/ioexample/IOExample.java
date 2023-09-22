package com.mycompany.ioexample;
import java.io.*;

/**
 *
 * @author cws
 */
public class IOExample {

    public static void main(String[] args) {
        
        try{
            FileWriter myFile = new FileWriter("/home/cws/Desktop/hello.txt");
            myFile.write("hell");
            myFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
