package Task6;

public class Pawn extends Chessman{
    public Pawn(int xCoordinate, int yCoordinate, String icon, String color) {
        super(xCoordinate, yCoordinate, icon, color);
        super.setName("Пешка");
    }
}
