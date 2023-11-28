package Task22.shapes;


public class Sphere extends Figure{
    private double radius;

    public Sphere() {
        super();
    }

    @Override
    protected void input() {
        InputChecker checker = new InputChecker();
        System.out.println(" -----  сфера  -----\n");
        this.radius = askUserInput(checker, "Введите радиус: ", '-');
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getVolume() {
        return 4D / 3 * Math.PI * Math.pow(this.radius, 3);
    }
}
