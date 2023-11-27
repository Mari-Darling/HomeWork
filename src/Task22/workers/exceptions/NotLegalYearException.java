package Task22.workers.exceptions;

public class NotLegalYearException extends Exception {
    public NotLegalYearException() {
    }

    public NotLegalYearException(String message) {
        super(message);
    }
}
