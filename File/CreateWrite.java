package File;

import java.io.File;
import java.io.FileWriter;

public class CreateWrite {
    public static void main(String[] args) {
        //create 
        try {
            File file = new File("File/Hello.txt");
            if(file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.out.println("Inside catch");
            System.out.println(e.getMessage());
        }


        //write
        try {
            FileWriter writer = new FileWriter("File/Hello.txt");
            writer.write("Good afternoon!");
            writer.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
