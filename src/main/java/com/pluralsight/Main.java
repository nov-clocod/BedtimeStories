package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the file you want to read: ");
        String story = myScanner.nextLine();

        try {
            BufferedReader myReader = new BufferedReader(new FileReader(story));
            String line;
            int lineNumber = 1;

            while ((line = myReader.readLine()) != null) {

                System.out.println(lineNumber + ".   " + line);
                lineNumber++;
            }
            myScanner.close();
            myReader.close();
        } catch (Exception exception) {
            System.out.println("File not found!");
            System.out.println(exception.getMessage());
        }
    }
}
