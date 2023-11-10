package Task2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
        int baseFloor;
        int floor;
        int weight;

        while (true) {
            baseFloor = input("выберите этаж на котором вы находитесь: ");
            if (!Elevator.isAllowableFloor(baseFloor)) {
                System.out.println("нет такого этажа");
                continue;
            }

            floor = input("выберите этаж на который вы хотите попасть: ");
            if (!Elevator.isAllowableFloor(floor)) {
                System.out.println("нет такого этажа");
                continue;
            }

            weight = input("уточните вес: ");
            if (!Elevator.isAllowableWeight(weight)) {
                System.out.println("недопустимый вес");
                continue;
            }

            Elevator elevator = new Elevator(weight);

            elevator.move(baseFloor, floor);
            break;

        }
        //scanner.close();

    }

    // доделать проверку введено ли число
    public static boolean ifInvalidInput(String input) {
        if (input.isEmpty() || input.isBlank()) {
            System.out.println("ничего не введено или введен пробел");
            return true;
        }
        return false;
    }

    public static int input(String hint) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(hint);
            String stringInput = scanner.nextLine();
            if (ifInvalidInput(stringInput)) {
                continue;
            } else {
                //scanner.close();
                return Integer.parseInt(stringInput);
            }
        }

    }
}
