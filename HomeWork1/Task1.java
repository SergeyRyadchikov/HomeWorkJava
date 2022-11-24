// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

import java.util.Scanner;

class Task1 {
    static int triangularNumber(int userNum) {
        int result = userNum * (userNum + 1) / 2;
        return result;
    }
    static int factorial (int userNum){
        if (userNum == 1) return 1;
        return userNum * factorial(userNum - 1);
    }
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = Enter.nextInt();
        Enter.close();
        System.out.printf("Треугольное число равно: %d\n", triangularNumber(n));
        System.out.printf("Факториал числа равен: %d", factorial(n));
    }
}