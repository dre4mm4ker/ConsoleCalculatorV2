package dre4mm4ker.ConsoleCalc;



class Calculator {

    static int result;

    static void calculate(Splitter.Sign sign, int a, int b) {


        switch (sign) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLE:
                result = a * b;
                break;
            default:
                result = a / b;
                break;
        }
    }
}