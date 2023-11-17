package chessmen;

public class King extends ChessFigure {

    public King(int xCoordinate, int yCoordinate, String color) {
        super(xCoordinate, yCoordinate, color);
        
    }

    @Override
    public int getXCoordinate() {
        return xCoordinate;
    }

    @Override
    public int getYCoordinate() {
        return yCoordinate;
    }

    @Override
    public String getFigureImage() {
        return figureImage;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void move() {
        // TODO: add realization
    }
    
}
