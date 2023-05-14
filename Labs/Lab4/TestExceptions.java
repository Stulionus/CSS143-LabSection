package Labs.Lab4;

import java.io.*;
public class TestExceptions{
    public static void main(String[] args) {

        //Open the Input file
        File inputFile = new File("Sample.jpg");
        //Open the Output file
        File outputFile1 = new File("Output1.jpg");

        //Get file handlers in Byte Stream format
        FileInputStream in1 = null;
        FileOutputStream out1 = null;
        int c1;
        try {
            in1 = new FileInputStream(inputFile);
            out1 = new FileOutputStream(outputFile1);
            while ((c1 = in1.read()) != -1) {   //Until end of file
                out1.write(c1);
            }
            in1.close();
            out1.close();
        }catch (IOException e){
            System.out.println("The file you have requested cannot be found.");
        }
    }
}


