package Task7;

import java.time.LocalDate;
import java.util.Random;

public class Store {
    Product[] products = new Product[20];

    public void fillingTheStoreWithGoods() {
        Random random = new Random();
        for (int i = 0; i < products.length; i++) {
            int numberOfDaysToSubtract = random.nextInt(200) + 1;
            LocalDate productionDate = LocalDate.now().minusDays(numberOfDaysToSubtract);
            int randomProduct = random.nextInt(5);
            switch (randomProduct) {
                case 0:
                    products[i] = new Milk("Молоко", 60, productionDate);
                    break;
                case 1:
                    products[i] = new Salt("Соль", 1000, productionDate);// переделать на инф
                    break;
                case 2:
                    products[i] = new Fish("Рыба", 20, productionDate);
                    break;
                case 3:
                    products[i] = new Corn("Кукуруза", 150, productionDate);
                    break;
                case 4:
                    products[i] = new Stew("Тушёнка", 180, productionDate);
                    break;
            }
        }
    }
}
