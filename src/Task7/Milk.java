package Task7;

import java.time.LocalDate;

public class Milk extends Product {


    public Milk(String title, int productExpirationDate, LocalDate producedOn) {
        super(title, productExpirationDate, producedOn);
    }

    @Override
    public boolean isFresh() {
        // Get date of production
        LocalDate productionDate = getProducedOn();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        long expDate = Long.parseLong(getProductExpirationDate());

        if (this.getPlace().compareTo(StoragePlace.SHOWCASE.getPlace()) == 0) {
            expDate /= 2;
        }

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusDays(expDate);

        return currentDate.isBefore(expirationDate);
    }

}
