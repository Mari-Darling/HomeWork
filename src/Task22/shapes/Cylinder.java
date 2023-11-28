package Task22.shapes;


public class Cylinder extends Figure {
    private double radius;
    private double h;

    public Cylinder() {
        super();
    }

    @Override
    protected void input() {
        InputChecker checker = new InputChecker();
        System.out.println(" -----  Цилиндр  -----\n");
        this.h = askUserInput(checker, "Введите h (высота): ", '-');
        this.radius = askUserInput(checker, "Введите радиус: ", '-');
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2) * h + 2 * Math.PI * radius * h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * h;
    }
}
