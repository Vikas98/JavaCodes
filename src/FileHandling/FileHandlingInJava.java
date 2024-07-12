package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingInJava {
    public static void main(String[] args) throws IOException {
        try {
            File obj = new File("input.txt");
            Scanner myReader = new Scanner(obj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        try
//        {
//            FileWriter wr = new FileWriter("input.txt");
//            wr.write("java is a programing language in which we are now learning the filehandling ");
//            wr.close();
//            System.out.println("successfull written ");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File obj = new File("C:\\Users\\Lenovo\\IdeaProjects\\javaCode\\src\\FileHandling\\input.txt");
//        try
//        {
//            if(obj.createNewFile())
//            {
//                System.out.println("created succesfully");
//            }
//            else
//            {
//                System.out.println("already exits \n"+obj.getAbsoluteFile());
//                System.out.println(obj.getName());
//                System.out.println(obj.canRead()+"  read");
//                System.out.println(obj.canWrite()+"  write");
//                System.out.println(obj.length());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        FileInputStream in = null;
//        FileOutputStream out = null;
//        try
//        {
//            System.out.println("write");
//            in = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\javaCode\\src\\FileHandling\\input.txt");
//            out = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\javaCode\\src\\FileHandling\\output.txt");
//            int c;
//            while ((c=in.read()) != -1) {
//                out.write(c);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            if (in != null)
//            {
//                in.close();
//            }
//            if(out != null)
//            {
//                out.close();
//            }
//        }
//

    }
}
