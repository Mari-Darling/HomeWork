package Task7;

import java.time.LocalDate;
import java.util.Random;

public abstract class Product {

    private String title;
    private int productExpirationDate;
    private final LocalDate producedOn;

    private StoragePlace place;

    public Product(String title, int productExpirationDate, LocalDate producedOn) {
        this.title = title;
        this.productExpirationDate = productExpirationDate;
        this.producedOn = producedOn;

    }

    public boolean isFresh() {
        // Get date of production
        LocalDate productionDate = getProducedOn();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        long expDate = Long.parseLong(getProductExpirationDate());

        if (this.getPlace().compareTo(StoragePlace.SHOWCASE.getPlace()) == 0 &&
                this.getClass().getSimpleName().compareTo("Milk") == 0) {
            expDate /= 2;
        }

        if (this.getPlace().compareTo(StoragePlace.SHOWCASE.getPlace()) == 0 &&
                this.getClass().getSimpleName().compareTo("Fish") == 0) {
            expDate /= 6;
        }

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusDays(expDate);

        return currentDate.isBefore(expirationDate);
    }

    public void placeProductTo() {
        Random random = new Random();
        if (random.nextBoolean()) {
            setPlace(StoragePlace.ICEBOX);
        } else {
            setPlace(StoragePlace.SHOWCASE);
        }

    }

    public String getProductExpirationDate() {
        return String.valueOf(productExpirationDate);
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place.getPlace();
    }

    private void setPlace(StoragePlace place) {
        this.place = place;
    }

    public void setProductExpirationDate(int productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }
}
