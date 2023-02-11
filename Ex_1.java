//1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {

            System.out.println("Вичисление n-ого треугольного числа.");
            tri(ask_n());
            System.out.println();
            System.out.println("Вичисление факториала.");
            func(ask_n());

    }


    public static int ask_n(){ //Запрос n числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int num = scanner.nextInt();
        System.out.println("Вы ввели число n = " + num);
        return num;
    }


    public static void tri(int num){ //Вычисление n-ое треугольное число
        System.out.print("Последовательность треугольных чисел до Тn-е: ");
        int summ = 0;
        for (int i = 1; i <= num; i++) {
            summ = summ + i;
            System.out.print(summ + " ");
        }
        System.out.println();
        System.out.println("Ответ, n-ое треугольное число равно " + summ);
    }


    public static void func(int num){ //Вычисление факториала
        int pow = 1;
        System.out.println("Последовательность чисел: ");
        for (int i = 1; i <= num; i++) {
            pow = pow * i;
            System.out.print(pow + " ");
        }
        System.out.println();
        System.out.println("Ответ, факториал равен " + pow);
    }


}
