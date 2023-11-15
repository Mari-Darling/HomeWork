package chessmen;

public abstract class ChessFigure {
    private int xCoordinate;
    private int yCoordinate;
    private String figureImage;
    private String color;

    public ChessFigure(int xCoordinate, int yCoordinate, String color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public String getFigureImage() {
        return figureImage;
    }

    public String getColor() {
        return color;
    }

}
