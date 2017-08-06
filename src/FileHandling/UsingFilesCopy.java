package FileHandling;
/**
 * In here importing classes, which are belong from java.io.package
 */
import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
/**
 * 
 * @author Vishwas
 * In this  program i've written a code to copy a file by 
 * using Files.copy()method.
 * so first i've created a class named UsingFilesCopy 
 * inside of class created main method and than
 * creating object of file class sourceFile and passing the path of sourceFile
 * than  in destFile file passing path of destination of copy file
 *
 */
 
public class UsingFilesCopy
{    
    public static void main(String[] args) throws IOException
    {
        File sourceFilePath = new File("E:/File In Java/DemoString.txt");
         
        File destFilepath = new File("E:/File In Java/New folder.txt");
         /**
          * using File.copy method as mention in question 
          * and in the constructor passing sourceFilePath and  destFilepath;
          */
        Files.copy(sourceFilePath.toPath(), destFilepath.toPath());
         
        System.out.println("File copid successfully by using Files.Copy method");
    }
}
