package org.example.View;

import org.example.Model.MathResult;
import org.example.Service.impls.View;
import java.util.Scanner;

public class ConsoleView implements View {
    public Integer enteringNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
    @Override
    public void showMathResult(MathResult result) {
        System.out.printf("Результат: %s", result.getResult());
    }
    public int showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("-".repeat(37)
                + "\nВыберите пункт меню: " +
                "\nКакую операцию Вы хотите осуществить: " + "\n");
        System.out.println("1.Сложение ");
        System.out.println("2.Вычитание ");
        System.out.println("3.Умножение ");
        System.out.println("4.Деление ");
        System.out.println("5.Выход ");
        System.out.print("Введите число от 1 до 5");
        return 0;
    }
}