package FileHandling;
import java.io.*;

/**
 *
 * @author cws
 */
public class CreateFile {
    public static void main(String[] args){
        try {
            File file = new File("/home/cws/Desktop/myFile.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
