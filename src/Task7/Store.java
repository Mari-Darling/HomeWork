package Task7;

import java.time.LocalDate;
import java.util.Random;

public class Store implements Printable {
    Product[] products = new Product[20];

    public void fillingTheStoreWithGoods() {
        Random random = new Random();
        StoragePlace place;

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
            placeProduct(products[i]);
        }
    }

    private void placeProduct(Product product) {
        product.placeProductTo();
    }

    public void doInspection() {
        print();
    }

    @Override
    public void print() {
        System.out.printf("%50s %n%n", "Inspection result");
        System.out.printf("|%-10s | %-15s | %-15s | %-5s | %5s |%n",
                "Product", "Produced on", "Storage place", "S. life days", "Fresh");
        drawLine();
        for (Product product : products) {
            System.out.printf("|%-10s | %-15s | %-15s | %-12s | %5s |%n",
                    product.getPlace(),
                    product.getTitle(),
                    product.getProducedOn(),
                    product.getProductExpirationDate(),
                    product.isFresh());
        }
        drawLine();
    }

    private void drawLine() {
        for (int i = 0; i < 72; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
