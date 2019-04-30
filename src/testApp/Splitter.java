package testApp;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static testApp.Converter.convertToArabian;

class Splitter {
    static int a;
    static int b;
    static int sign; // 1(сложение), 2(вычетание), 3(умножение), 4(деление)
    static boolean ar; // true - арабские, false - римские



    static void Split(String inputNum) throws InputException {
        String arabPattern = "([1-9]|(10))";
        String romePattern = "(I|II|III|IV|V|VI|VII|VIII|IX|X)";
        Pattern pattern1 = Pattern.compile("(" + arabPattern + "[+*/-]"+arabPattern+ ")|(" + romePattern + "[+*/-]" + romePattern + ")");
        Pattern pattern2 = Pattern.compile(arabPattern + "[+*/-]"+arabPattern);
        Matcher matcher1 = pattern1.matcher(inputNum);
        Matcher matcher2 = pattern2.matcher(inputNum);

        if(!matcher1.matches()){
            throw new InputException("Incorrect input");
        }

        String[] nums = inputNum.split("[+/*-]");
        if (inputNum.contains("+")){sign = 1;}
        else if (inputNum.contains("-")) {sign=2;}
        else if (inputNum.contains("*")) {sign=3;}
        else {sign=4;}


        if(matcher2.matches()){
            ar = true;
            a = Integer.parseInt(nums[0]);
            b = Integer.parseInt(nums[1]);
        }
        else {
            ar = false;
            a = convertToArabian(nums[0]);
            b = convertToArabian(nums[1]);
        }
    }
}



