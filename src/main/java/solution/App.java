package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value/n");
        String s = "";
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        numberOfOneBits.Solution(Integer.parseInt(s));

        System.out.println("HelloWorld!");
    }
}


