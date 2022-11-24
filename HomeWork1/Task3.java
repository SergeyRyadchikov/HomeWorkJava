// Реализовать простой калькулятор

package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.printf("Результат вычислений: %.2f", calculator());
    }

    static double getItem() {
        Scanner enterNum = new Scanner(System.in);
        System.out.print("Введите число --> ");
        double number;
        if (enterNum.hasNextDouble()) {
            number = enterNum.nextDouble();
        } else {
            System.out.println("Введено некорректное значние! Повторите попытку --> ");
            enterNum.next();
            number = getItem();
        }
        return number;
    }

    static char getOperation() {
        Scanner enterChar = new Scanner(System.in);
        System.out.print("Выберете операцию --> ");
        char enterOperation;
        if (enterChar.hasNext()) {
            enterOperation = enterChar.next().charAt(0);
        } else {
            System.out.println("Введены некорректные данные! Повторите попытку --> ");
            enterChar.next();
            enterOperation = getOperation();
        }
        return enterOperation;
    }

    static double calculator() {
        double numberFirst = getItem();
        double numberSecond = getItem();
        char operation = getOperation();
        double result;
        switch (operation) {
            case '+':
                result = numberFirst + numberSecond;
                break;
            case '-':
                result = numberFirst - numberSecond;
                break;
            case '*':
                result = numberFirst * numberSecond;
                break;
            case '/':
                result = numberFirst / numberSecond;
                break;
            default:
                System.out.println("Операция не распознана! Пожалуйста, повторите ввод!");
                result = calculator();
        }
        return result;
    }
}