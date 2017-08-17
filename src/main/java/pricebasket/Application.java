package pricebasket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = reader.readLine().toLowerCase();
            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Invalid input. Exiting program.");
        }
    }
}
