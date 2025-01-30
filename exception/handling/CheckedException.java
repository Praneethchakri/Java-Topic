package exception.handling;

import java.io.*;

/**
 * Also called as  Compiled Time Exceptions.
 */
public class CheckedException {

    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("C:\\Users\\DELL\\Downloads\\GIT\\Java-Topic\\testFile.txt");
            try {
                int inputStream = f.read();
                while(inputStream!=-1){
                    System.out.print((char)inputStream);
                    inputStream = f.read();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
