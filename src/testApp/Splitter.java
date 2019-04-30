package testApp;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static testApp.Converter.convertToArabian;

public class Splitter {
    int a;
    int b;
    int sign; // 1(сложение), 2(вычетание), 3(умножение), 4(деление)
    boolean ar; // true - арабские, false - римские
    String inputNum;


    public  Splitter(String inputNum) throws InputException {
        this.inputNum = inputNum;
        Split();
    }
    private void Split() throws InputException {
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
        if (inputNum.contains("+")){this.sign = 1;}
        else if (inputNum.contains("-")) {this.sign=2;}
        else if (inputNum.contains("*")) {this.sign=3;}
        else {this.sign=4;}


        if(matcher2.matches()){
            this.ar = true;
            this.a = Integer.parseInt(nums[0]);
            this.b = Integer.parseInt(nums[1]);
        }
        else {
            this.ar = false;
            this.a = convertToArabian(nums[0]);
            this.b = convertToArabian(nums[1]);
        }
    }
}



