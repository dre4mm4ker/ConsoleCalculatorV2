package dre4mm4ker.ConsoleCalc;

import java.util.Scanner;

import static dre4mm4ker.ConsoleCalc.Converter.convertToRomanian;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
                String s = sc.nextLine();
                Splitter.Split(s);
                Calculator.calculate(Splitter.sign, Splitter.a, Splitter.b);
            if (Splitter.isArabian) {
                System.out.println(Calculator.result);
            } else {
                System.out.println(convertToRomanian(Calculator.result));
            }
        }
    }
}
