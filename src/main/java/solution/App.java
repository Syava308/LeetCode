package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        String s = "abcdefgh";

        ZigzagConversion zz = new ZigzagConversion();
        String result = zz.convert(s,4);
        System.out.println(result);
    }
}


