import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример. Допустимый формат: "число действие число" например 3 + 6);
        String str = scanner.nextLine();
        scanner.close();
        String[] s = str.split(" ");

        for (int i = 1; i < 11; i++) {
            String b = s[0];
            String n = String.valueOf(Rim.values()[i]);
            if (b.equals(n)) {
                int num1 = Rim.values()[i].ordinal();
                for (int j = 1; j < 11; j++) {
                    String l = s[2];
                    String v = String.valueOf(Rim.values()[j]);
                    if (l.equals(v)) {
                        int num2 = Rim.values()[j].ordinal();
                        String operation = s[1];
                        int result = calcRim(num1, num2, operation);
                            if (result>0) {
                                String result1 = String.valueOf(Rim.values()[result]);
                                System.out.println("Результат =  " + result1);
                            }else {
                                System.out.println("Недопустимое действо с римскими цифрами");
                            }
                    }

                }
            }

        }
        int a = 11;
        try {
            a = Integer.parseInt(s[0]);
        } catch (NumberFormatException e) {
        }

        int c = 11;
        try {
            c = Integer.parseInt(s[2]);
        } catch (NumberFormatException e) {
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
                    System.err.println("Вы ввели что-то неправильно!");

            }
            System.out.println("Результат = " + x);
        }

    }

    public static int calcRim(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("допустимые символы + - * /");
        }
        return result;
    }

}
