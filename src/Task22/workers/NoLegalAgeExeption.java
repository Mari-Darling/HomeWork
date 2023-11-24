package Task22.workers;

public class NoLegalAgeExeption extends IllegalArgumentException{
    public NoLegalAgeExeption() {
    }

    public NoLegalAgeExeption(String s) {
        super(s);
    }
}
