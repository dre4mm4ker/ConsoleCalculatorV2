package testApp;

import java.util.Scanner;

import static testApp.Splitter.Split;
import static testApp.Maths.Calculate;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                Split(s);
                System.out.println(Calculate(Splitter.sign, Splitter.ar, Splitter.a, Splitter.b));
            } catch (InputException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
