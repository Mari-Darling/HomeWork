package Task22.workers.exceptions;

public class NoLegalAgeExeption extends IllegalArgumentException{
    public NoLegalAgeExeption() {
    }

    public NoLegalAgeExeption(String s) {
        super(s);
    }
}
