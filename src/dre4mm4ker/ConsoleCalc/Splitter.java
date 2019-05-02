package dre4mm4ker.ConsoleCalc;


import java.util.regex.Pattern;
import java.util.regex.Matcher;



class Splitter {
    enum Sign{PLUS, MINUS, MULTIPLE, DIVIDE}
    static int a;
    static int b;
    static boolean isArabian;
    static Sign sign;



    static void Split(String inputNum) throws InputException {
        String arabPattern = "([1-9]|10)";
        String romePattern = "(I|II|III|IV|V|VI|VII|VIII|IX|X)";
        Pattern pattern1 = Pattern.compile(arabPattern + "\\s([+*/-])\\s"+arabPattern+ "|" + romePattern + "\\s([+*/-])\\s" + romePattern);
        Matcher matcher1 = pattern1.matcher(inputNum);

        int groupIndex;

        if(!matcher1.matches()){
            throw new InputException("Incorrect input");
        }

        if(matcher1.group(1) != null){
            isArabian = true;
            a = Integer.parseInt(matcher1.group(1));
            b = Integer.parseInt(matcher1.group(3));
            groupIndex = 2;
        }
        else {
            isArabian = false;
            a = Converter.convertToArabian(matcher1.group(4));
            b = Converter.convertToArabian(matcher1.group(6));
            groupIndex = 5;
        }

        switch (matcher1.group(groupIndex)){
            case "+":
                sign = Sign.PLUS;
                break;
            case "-":
                sign = Sign.MINUS;
                break;
            case "*":
                sign = Sign.MULTIPLE;
                break;
            case "/":
                sign = Sign.DIVIDE;
                break;
        }
    }
}



