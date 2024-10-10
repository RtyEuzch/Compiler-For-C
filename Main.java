import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the file you would like to compile: ");
            String name = sc.nextLine();
            FileInputStream inputSourceFile = new FileInputStream(name);
            CParser parse = new CParser(inputSourceFile);

            parse.Start();
            System.out.println("Parsing successfully completed!");

            inputSourceFile.close();
            sc.close();
        } /*catch (ParseException e) {
            System.out.println("Fatal error when parsing: \n");
            e.printStackTrace();
        } */catch (Exception e) {
            e.printStackTrace();
        }
    }
}