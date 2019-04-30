package testApp;

import static testApp.Converter.convertToArabian;

class Maths {

    //sign - 1(сложение), 2(вычетание), 3(умножение), 4(деление)
    //ar - (true - арабские), (false - римские)
    static String Calculate(int sign, boolean ar, int a, int b) {
        int temp;

        if (sign == 1) {
            temp = a + b;
        } else if (sign == 2) {
            temp = a - b;
        } else if (sign == 3) {
            temp = a * b;
        } else {
            temp = a / b;
        }

        if (ar){return String.valueOf(temp); }
        else {
            try {
                return convertToArabian(temp);
            } catch (InputException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    return "";
    }
}