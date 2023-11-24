package poker;

import java.util.Arrays;
import java.util.Scanner;

public class Helper {
    Scanner scanner = new Scanner(System.in);

    public void askToReturnCard(Hand hand){
           System.out.println("введите номера карты (1-5) которую вы хотите вернуть");
           String userInput = getUserInput();
           // сделать проверки

           // вызвать метод из Hand return card
    } 

    public void askToChangeCards(Hand hand) {

        String[] cardsToChange;
        String userInput;

        System.out.println("""
                введите номера карт (1-5) которые вы хотите заменить \
                через пробел например 0 3 4 заменит 0,3,4 карты соответственно
                либо нажмите Enter чтобы пропустить действие \
                """);

        // проверка ввода, вайл крутится пока не будет верного ввода
        while (true) {

            userInput = getUserInput();

            if (userInput.length() == 0) {
                System.out.println("Вы выбрали не заменять карты");
                return;
            }

            if (checkInput(userInput)) {
                System.out.println("верный ввод");
                break;
            }

            System.out.println("попробуйте ещё раз:");
        }

        cardsToChange = userInput.split(" ");
        System.out.println(cardsToChange.length);
        System.out.println(Arrays.toString(cardsToChange));

        hand.changeCards(cardsToChange);

        scanner.close();

    }

    private boolean checkInput(String line) {
        if (!isLineContainsOnlyDigits(line)) {
            System.out.println("надо ввести числа от 1 до 5 через пробел (были введены не числа)");
            return false;
        }

        String[] nums = line.split(" ");
        if (nums.length > 5) {
            System.out.println("введено больше 5 карт");
            return false;
        }
        for (String num : nums) {
            if (Integer.parseInt(num) > 5 || Integer.parseInt(num) < 1) {
                System.out.println("надо ввести числа от 1 до 5 через пробел (были введены числа вне этого диапазона)");
                return false;
            }
        }
        return true;
    }

    private boolean isLineContainsOnlyDigits(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                continue;
            }
            if (!Character.isDigit(line.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private String getUserInput() {
        return scanner.nextLine().trim();
    }
    
}
