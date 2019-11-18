package io.zipcoder.polymorphism;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(InputStream in, PrintStream out){
        this.input = new Scanner(in);
        this.output = out;
    }

    public Integer getInteger(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }

}
