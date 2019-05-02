package dre4mm4ker.ConsoleCalc;



class Calculator {



    static int calculate(Splitter.Sign sign, int a, int b) {


        switch (sign) {
            case PLUS:
                return a + b;

            case MINUS:
                 return a - b;

            case MULTIPLE:
                return  a * b;

            case DIVIDE:
                return a / b;

        }
        return 0;
    }
}