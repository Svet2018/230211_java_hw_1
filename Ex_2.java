import java.util.ArrayList;
import java.util.Scanner;

//2. Вывести все простые числа от 1 до N
public class Ex_2 {

    public static void main(String[] args) {

        int number = getNum();
        printNum(number);
        System.out.println();
        newList(number);

    }

    public static int getNum() {//Задается число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число до которого хотите вывести простые числа: ");
        int num = scanner.nextInt();
        System.out.println();
        System.out.println("В ввели число " + num + " до которого сгенерированы следующие числа: ");
        return num;
    }

    public static void printNum(int a) {//Печатается последовательность целых чисел
        ArrayList<Integer> numberList = new ArrayList<>(a); //Создается лист чисел
        for (int i = 1; i <= a; i++) {
            numberList.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
        // System.out.print(numberList);
    }

    public static void newList(int a) {//Вычисляются простые числа
        ArrayList<Integer> numList = new ArrayList<>(a);
        bool1(a);
        for (int i = 1; i <= a; i++) {
            if (bool1(i)) {
                numList.add(i);
            }
        }
        System.out.println("Ответ простые числа: ");
        System.out.println(numList);
    }

    static boolean bool1(int a) { // Проверяются числа на принадлежность к простым числам
        int num = 2;
        while (a % num != 0 && num < a)
            num++;
        return (num == a);
    }
}
