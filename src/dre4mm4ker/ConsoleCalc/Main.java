package dre4mm4ker.ConsoleCalc;

import java.util.Scanner;

import static dre4mm4ker.ConsoleCalc.Converter.convertToRomanian;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
                String s = sc.nextLine();
                Splitter.Split(s);
            if (Splitter.isArabian) {
                System.out.println(Calculator.calculate(Splitter.sign, Splitter.a, Splitter.b));
            } else {
                System.out.println(convertToRomanian(Calculator.calculate(Splitter.sign, Splitter.a, Splitter.b)));
            }
        }
    }
}
