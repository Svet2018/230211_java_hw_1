//3. Реализовать простой калькулятор

import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {

        System.out.println("Калькулятор ");
        int a = scanner();
        int b = scanner();
        int c = sign();

        if (c == 1) summa(a, b);
        else if (c == 2) power(a, b);
        else if (c == 3) diff(a, b);
        else if (c == 4) div(a, b);

    }

    public static int scanner() { // Запрашивает у пользователя число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    public static int sign() { // Запрашивает у пользователя арифметичесоке действие
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое действие +, -, /, *: ");
        String sign = scanner.nextLine();
        return switch (sign) {
            case "+" -> 1;
            case "*" -> 2;
            case "-" -> 3;
            default -> 4;
        };
    }

    public static void summa(int num1, int num2) { // Вычисляет сумму чисел
        int summ = num1 + num2;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        System.out.println("Сумма чисел: " + num1 + " + " + num2);
        System.out.println("Ответ: " + summ);
    }

    public static void power(int num1, int num2) { // Вычисляет произведение чисел
        int pow = num1 * num2;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        System.out.println("Произведение чисел: " + num1 + " * " + num2);
        System.out.println("Ответ: " + pow);
    }

    public static void diff(int num1, int num2) { // Вычисляет разность чисел
        int dif = num1 - num2;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        System.out.println("Разность чисел: " + num1 + " - " + num2);
        System.out.println("Ответ: " + dif);
    }

    public static void div(double num1, double num2) { // Вычисляет частное чисел
        double div;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        try {
            div = num1 / num2;
            System.out.println("Деление чисел: " + num1 + " / " + num2);
            System.out.println("Ответ: " + div);
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя!");
        }
    }
}

