package chessmen;

public abstract class ChessFigure {
    protected int xCoordinate;
    protected int yCoordinate;
    protected String figureImage;
    protected String color;

    public ChessFigure(int xCoordinate, int yCoordinate, String color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }

    public abstract int getXCoordinate() ;

    public abstract int getYCoordinate() ;

    public abstract String getFigureImage() ;

    public abstract String getColor() ;

    public abstract void move();

}
