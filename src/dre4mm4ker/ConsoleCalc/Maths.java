package dre4mm4ker.ConsoleCalc;

import static dre4mm4ker.ConsoleCalc.Converter.convertToArabian;

class Maths {


    static String Calculate(Splitter.Sign sign, boolean isArabian, int a, int b) {
        int temp;

        if (sign == Splitter.Sign.PLUS) {
            temp = a + b;
        } else if (sign == Splitter.Sign.MINUS) {
            temp = a - b;
        } else if (sign == Splitter.Sign.MULTIPLE) {
            temp = a * b;
        } else {
            temp = a / b;
        }

        if (isArabian) {
            return String.valueOf(temp);
        } else {
            return convertToArabian(temp);
        }
    }
}