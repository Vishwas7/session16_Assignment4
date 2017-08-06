package FileHandling;
/**
 * In here importing classes, which are belong from java.io.package
 */

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 /**
 * 
 * @author Vishwas
 * In this  program i've created a code to copy a file by 
 * using Stream()method as mention in the question.
 * so first i've created a class named StreamFileCopy 
 * inside of class created main method and than
 * creating object of file class pathForCopy and passing the path of sourceFile
 * than  in pastThePath file passing path of destination of copy file
 *
 */
public class StreamFileCopy
{    
    public static void main(String[] args)
    {    
        File pathForCopy = new File("E:/File In Java/DemoString.txt");
         
        File pastThePath = new File("E:/File In Java/UsingStreamToCopy.txt");
         /**
          * creating instance of FileInputStream and initializing by null;
          * than creating instance of FileOutputStream and initializing by null;
          */
        FileInputStream inputStream = null;
         
        FileOutputStream outputStream = null;
        
        try
        {
        	inputStream = new FileInputStream(pathForCopy);
             
        	outputStream = new FileOutputStream(pastThePath);
             
            byte[] buffer = new byte[1024];
             
            int length;
             
            while ((length = inputStream.read(buffer)) != -1) 
            {
            	outputStream.write(buffer, 0, length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
            	//Closing the resources
            	inputStream.close();
                 
                outputStream.close();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
         // window console
        System.out.println("You've Successfully Used Stream method to Copy A File");
    }
}