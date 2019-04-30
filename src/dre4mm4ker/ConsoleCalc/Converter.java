package dre4mm4ker.ConsoleCalc;

class Converter {

    static int convertToArabian(String s) {
        switch (s) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            default:
                return 10;
        }
    }
    private static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            switch (n) {
                case 1:
                    return one;
                case 2:
                    return one + one;
                case 3:
                    return one + one + one;
                case 4:
                    return one + five;
                case 5:
                    return five;
                case 6:
                    return five + one;
                case 7:
                    return five + one + one;
                case 8:
                    return five + one + one + one;
                case 9:
                    return one + ten;
            }

        }
        return "";
    }

    static String convertToArabian(int number) throws InputException {

        if (number <= 0){
            throw new InputException("There is no 0 or negative numbers in Roman Numerals");
        }

        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");




        return romanHundreds + romanTens + romanOnes;
    }
}