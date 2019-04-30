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
                this.result = convert(temp);
            } catch (InputException e) {
                e.printStackTrace();
            }
        }
    }
    public static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            if(n == 1)
            {
                return one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }

        }
        return "";
    }

    public static String convert(int number) throws InputException {

        if (number <= 0){
            throw new InputException("There is no 0 or negative numbers in Roman Numerals");
        }

        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");
        number /=10;
        String romanThousands = romanDigit(number%10, "M", "", "");


        String result = romanThousands + romanHundreds + romanTens + romanOnes;

        return result;
    }
}