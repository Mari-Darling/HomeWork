package Task7;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.fillingTheStoreWithGoods();
        for (int i = 0; i < store.products.length; i++) {
            System.out.println(store.products[i].getTitle());
            System.out.println(store.products[i].isFresh());
            System.out.println("----------------------------------");
        }
    }
}
