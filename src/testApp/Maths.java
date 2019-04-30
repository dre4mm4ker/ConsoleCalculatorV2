package testApp;

import static testApp.Converter.convertToArabian;

class Maths {

    String result;
    //sign - 1(сложение), 2(вычетание), 3(умножение), 4(деление)
    //ar - (true - арабские), (false - римские)
    public Maths(int sign, boolean ar, int a, int b) {
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

        if (ar){this.result = String.valueOf(temp); }
        else {
            try {

                this.result = convertToArabian(temp);
            } catch (InputException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}