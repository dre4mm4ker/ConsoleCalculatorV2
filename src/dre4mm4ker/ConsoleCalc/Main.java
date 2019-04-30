package dre4mm4ker.ConsoleCalc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
                String s = sc.nextLine();
                Splitter.Split(s);
                System.out.println(Maths.Calculate(Splitter.sign, Splitter.isArabian, Splitter.a, Splitter.b));
        }
    }
}
