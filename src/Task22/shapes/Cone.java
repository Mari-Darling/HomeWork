package Task22.shapes;


public class Cone extends Figure {
    private double radius;
    private double h;


    public Cone() {
        super();
    }

    @Override
    protected void input() {
        InputChecker checker = new InputChecker();
        System.out.println(" -----  конус  -----\n");
        this.h = askUserInput(checker, "Введите h (высота): ", '-');
        this.radius = askUserInput(checker, "Введите радиус: ", '-');
    }

    @Override
    public double getArea() {
        double l = Math.sqrt(Math.pow(radius, 2) + Math.pow(h, 2));

        return Math.PI * radius * (radius + l);
    }

    @Override
    public double getVolume() {
        return 1D / 3 * Math.PI * Math.pow(radius, 2) * h;
    }
}

