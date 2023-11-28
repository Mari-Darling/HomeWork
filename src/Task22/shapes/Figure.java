package Task22.shapes;

import Task22.shapes.exceptions.NegativeValueException;

import java.util.Scanner;

public abstract class Figure implements Shape {
    public Figure(Scanner scanner) {
        input(scanner);
    }

    protected abstract void input(Scanner scanner);

    protected double askUserInput(Scanner scanner, InputChecker checker, String message, char fillCharacter) {
        System.out.print(message);
        String inp = scanner.nextLine();
        try {
            checker.checkInput(inp);
        } catch (NegativeValueException | NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("StackTrace message: ");
            e.printStackTrace();
            oneSecondPause(); // иначе вывод немного перемешается
            drawLine('-', 50, true);
            return askUserInput(scanner, checker, message, fillCharacter);
        }
        return Double.parseDouble(inp);
    }

    private void oneSecondPause() {
        try {
            Thread.sleep(1000); // Остановка выполнения программы на 1 секунду
        } catch (InterruptedException i) {
            // Обработка исключения, если поток был прерван
            i.printStackTrace();
        }
    }

    private void drawLine(char fillCharacter, int times, boolean tabulation) {
        if (tabulation) {
            System.out.print("\n\t\t");
        }
        for (int i = 0; i < times; i++) {
            System.out.print(fillCharacter);
        }
        System.out.println("\n");
    }
}
