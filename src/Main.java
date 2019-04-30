import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            Splitter ch = new Splitter(s);
            Maths maths = new Maths(ch.sign, ch.ar, ch.a, ch.b);
            System.out.println(maths.result);
        }
        catch (InputException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
