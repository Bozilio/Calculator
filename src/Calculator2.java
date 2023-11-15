import java.util.Arrays;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner primer = new Scanner(System.in);
        System.out.println("Введите пример");
        String stroka = primer.nextLine();
        primer.close();

        String[] s = stroka.split(" ");
        Short a = 0;
        try {
            a = Short.parseShort(s[0]);

        } catch (NumberFormatException e) {
            System.err.println("неправильный формат числа1");
        }

        Short c = 0;
        try {
            c = Short.parseShort(s[2]);

        } catch (NumberFormatException e) {
            System.err.println("неправильный формат числа2");
        }
if (a >=0 && a <=10 && c>=0 && c <=10) {

    int x = 0;
    switch (s[1]) {
        case "+":
            x = a + c;
            break;
        case "-":
            x = a - c;
            break;
        case "/":
            x = a / c;
            break;
        case "*":
            x = a * c;
            break;
        default:
            System.out.println("допустимые символы + - * /");

    }
    System.out.println("Результат = " + x);
}
else System.out.println("Допускаются значения от 0 до 10!");

    }

    }
