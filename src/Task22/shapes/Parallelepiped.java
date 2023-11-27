package Task22.shapes;

import Task22.shapes.exceptions.NegativeValueException;

import java.util.Scanner;

public class Parallelepiped implements Shape {
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
        input();
    }

    @Override
    public double getArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        InputChecker checker = new InputChecker();
        getLength(scanner, checker);
//        this.length = getLength(scanner, checker);
//        this.width = getWidth(scanner, checker);
//        this.height = getHeight(scanner, checker);
        scanner.close();
    }

    private double getHeight(Scanner scanner, InputChecker checker) {
        System.out.print("Введите высоту: ");
        String inp = scanner.nextLine();

        try {
            checker.checkInput(inp);
        } catch (NegativeValueException | NumberFormatException e) {
            e.printStackTrace();
            getHeight(scanner, checker);
        }
        return Double.parseDouble(inp);
    }

    private double getWidth(Scanner scanner, InputChecker checker) {
        System.out.print("Введите ширину: ");
        String inp = scanner.nextLine();
        try {
            checker.checkInput(inp);
        } catch (NegativeValueException | NumberFormatException e) {
            e.printStackTrace();
            getWidth(scanner, checker);
        }
        return Double.parseDouble(inp);


    }

    private double getLength(Scanner scanner, InputChecker checker) {
        System.out.print("Введите длину: ");
        String inp = scanner.nextLine();
        try {
            checker.checkInput(inp);
        } catch (NegativeValueException | NumberFormatException e) {
            e.printStackTrace();
            getLength(scanner, checker);
        }

        return 0;

    }
}
