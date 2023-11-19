package Task7;

import java.time.LocalDate;

public abstract class Product {

    private String title;
    private final int productExpirationDate;
    private final LocalDate producedOn;

    public Product(String title, int productExpirationDate, LocalDate producedOn) {
        this.title = title;
        this.productExpirationDate = productExpirationDate;
        this.producedOn = producedOn;
    }
    public  boolean isFresh(){
        // Get date of production
        LocalDate productionDate = getProducedOn();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusDays(getProductExpirationDate());

        return currentDate.isBefore(expirationDate);
    }

    public int getProductExpirationDate() {
        return productExpirationDate;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public String getTitle() {
        return title;
    }
}
