package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int channel;
        while (true){
            System.out.println("Выберете канал. ");
            String strChannal = scanner.nextLine();
            if (strChannal.isBlank() || strChannal.isEmpty()){
                System.out.println("Ошибка! Вы ни чего не ввели, попробуйте снова.");
                continue;
            }
            channel = Integer.parseInt(strChannal);
            if (channel <= 0){
                System.out.println("Ошибка! Канал не может быть отрицательным ");
                continue;
            }
            if (channel > 5){
                System.out.println("Ошибка! Нет такого канала ");
                continue;

            }
            break;


        }


        Television tv = new Television(channel, 5);
        tv.displayChannel();

        System.out.println("чтобы переключить канал вперед нажмите 1");
        System.out.println("чтобы переключить канал назад нажмите 2");
        System.out.println("чтобы ввести номер канала нажмите 3");
        System.out.print("введите значение: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                tv.nextChannel();
                break;
            case 2:
                tv.previousChannel();
            case 3:
                System.out.print("ввести номер канала: ");
                int ch = scanner.nextInt();
                tv.setChanel(ch);
            default:
                System.out.println("нет такого пункта в меню");
        }




/*        tv.nextChannel();
        tv.previousChannel();
        tv.previousChannel();
        tv.goToChannel(5);*/

    }
}
