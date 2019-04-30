package dre4mm4ker.ConsoleCalc;

import static dre4mm4ker.ConsoleCalc.Converter.convertToArabian;

class Maths {


    static String Calculate(Splitter.Sign sign, boolean isArabian, int a, int b) {
        int temp;

        switch (sign) {
            case PLUS:
                temp = a + b;
                break;
            case MINUS:
                temp = a - b;
                break;
            case MULTIPLE:
                temp = a * b;
                break;
            default:
                temp = a / b;
                break;
        }

        if (isArabian) {
            return String.valueOf(temp);
        } else {
            return convertToArabian(temp);
        }
    }
}