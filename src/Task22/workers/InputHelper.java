package Task22.workers;

import java.util.Scanner;

public class InputHelper {
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите ваше имя:  ");
        String name = scanner.nextLine();
        chekIfWord(name);
        System.out.print("введите вашу фамилию:  ");
        String suname = scanner.nextLine();
        chekIfWord(suname);

        System.out.print("введите ваш год рождения:  ");
        String yearOfBitth = scanner.nextLine();
        chekIfNumber(yearOfBitth);
        System.out.print("введите год начала работы: ");
        String startWorkYear = scanner.nextLine();
        chekIfNumber(startWorkYear);
    }

    private void checInput() {


    }

    private void chekIfWord(String word) {
        for (int w = 0; w < word.length(); w++) {
            if (Character.isDigit(word.charAt(w))) {
                throw new IllegalArgumentException("введены не допустимые символы: ");
            }
        }
    }

    private void chekIfNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("введено не число");
        }
    }

    private void ifOkAge(int age, int year){
        if(2023 - year < 18){
            throw new NoLegalAgeExeption("нельзя работать до 18 лет");
        }
    }

    private void ifOkYear(int age, int year){
        if(2023 - year < 18){
            throw new NoLegalAgeExeption("нельзя работать до 18 лет");
        }
    }
}
