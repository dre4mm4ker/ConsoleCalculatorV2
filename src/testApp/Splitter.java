package testApp;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static testApp.Converter.convertToArabian;

public class Splitter {
    int a;
    int b;
    int sign; // 1(сложение), 2(вычетание), 3(умножение), 4(деление)
    boolean ar; // true - арабские, false - римские

    public Splitter() throws InputException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Converter conv = new Converter();

        String arabPattern = "([1-9]|(10))";
        String romePattern = "(I|II|III|IV|V|VI|VII|VIII|IX|X)";
        Pattern pattern1 = Pattern.compile("(" + arabPattern + "[+*/-]"+arabPattern+ ")|(" + romePattern + "[+*/-]" + romePattern + ")");
        Pattern pattern2 = Pattern.compile(arabPattern + "[+*/-]"+arabPattern);
        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);

        if(!matcher1.matches()){
            throw new InputException("Incorrect input");
        }

        String[] nums = s.split("[+/*-]");
        if (s.contains("+")){this.sign = 1;}
        else if (s.contains("-")) {this.sign=2;}
        else if (s.contains("*")) {this.sign=3;}
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

