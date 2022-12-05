// Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи.
//  Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        polskaCalculator();
    }

    private static void polskaCalculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        var str = scan.nextLine().split(" ");
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            if (isDigit(str[i])) {
                st.push(Integer.parseInt(str[i]));
            } else {
                switch (str[i]) {
                    case "+":
                        result = st.pop() + st.pop();
                        st.push(result);
                        break;
                    case "-":
                        result = -st.pop() + st.pop();
                        st.push(result);
                        break;
                    case "*":
                        result = st.pop() * st.pop();
                        st.push(result);
                        break;
                    case "/":
                        int num1 = st.pop();
                        result = st.pop() / num1;
                        st.push(result);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("Количество элементов в стэке: %s\n",st.size());
        System.out.printf("Результат = %d\n", st.pop());
        
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
