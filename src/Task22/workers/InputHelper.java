package Task22.workers;

import Task22.workers.exceptions.NoLegalAgeExeption;
import Task22.workers.exceptions.NotLegalYearException;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHelper {
    private String name;
    private String surName;
    private String yearOfBirth;
    private String startWorkYear;
    LocalDate localDate = LocalDate.now();
    int year = localDate.getYear();

    public void input() {
        Scanner scanner = new Scanner(System.in);


        nameInput(scanner);
        surnameInput(scanner);
        yearOfBirthInput(scanner, year);
        yearOfStartWork(scanner, year);

        scanner.close();
    }

    private int yearOfStartWork(Scanner scanner, int thisYear) {
        System.out.print("введите год начала работы: ");
        startWorkYear = scanner.nextLine();
        try {
            checkIfNumber(startWorkYear);
            ifFutureYear(Integer.parseInt(startWorkYear), thisYear);
            ifOkAge();
        } catch (NumberFormatException | NotLegalYearException | NoLegalAgeExeption e) {
            System.out.println(e.getMessage());
            return yearOfStartWork(scanner, thisYear);
        }
        return 0;
    }

    private int yearOfBirthInput(Scanner scanner, int thisYear) {
        System.out.print("введите ваш год рождения:  ");
        yearOfBirth = scanner.nextLine();
        try {
            checkIfNumber(yearOfBirth);
            ifFutureYear(Integer.parseInt(yearOfBirth), thisYear);
        } catch (NumberFormatException | NotLegalYearException e) {
            System.out.println(e.getMessage());
            return yearOfBirthInput(scanner, thisYear);
        }

        return 0;
    }

    private int surnameInput(Scanner scanner) {
        System.out.print("введите вашу фамилию:  ");
        this.surName = scanner.nextLine();
        try {
            checkIfWord(surName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return surnameInput(scanner);
        }
        return 0;
    }

    private int nameInput(Scanner scanner) {
        System.out.print("введите ваше имя:  ");
        this.name = scanner.nextLine();
        try {
            checkIfWord(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return nameInput(scanner);
        }
        return 0;
    }

    private void checkIfWord(String word) {
        for (int w = 0; w < word.length(); w++) {
            if (Character.isDigit(word.charAt(w))) {
                throw new IllegalArgumentException("введены не допустимые символы");
            }
        }
    }

    private void checkIfNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("введено не число");
        }
    }

    private void ifOkAge() throws NoLegalAgeExeption {
        if (Integer.parseInt(startWorkYear) - Integer.parseInt(yearOfBirth) < 18) {
            throw new NoLegalAgeExeption("нельзя работать до 18 лет");
        }
    }

    private void ifFutureYear(int testYear, int curYear) throws NotLegalYearException {
        if (testYear > curYear) {
            throw new NotLegalYearException("введённый год больше по значению текущего года");
        }
    }

    @Override
    public String toString() {
        return "\nname: " + this.name + "\n"
                + "surname: " + this.surName + "\n"
                + "year of birth: " + this.yearOfBirth + "\n"
                + "year of start work: " + this.startWorkYear + "\n"
                + "work experience: " + (this.year - Integer.parseInt(this.startWorkYear));



    }
}