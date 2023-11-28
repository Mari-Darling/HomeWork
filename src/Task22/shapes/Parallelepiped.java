package Task22.shapes;

public class Parallelepiped extends Figure {
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
        super();
    }

    @Override
    public double getArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }


    @Override
    protected void input() {
        InputChecker checker = new InputChecker();

        System.out.println(" -----  параллелепипед  -----\n");

        this.length = askUserInput(checker, "Введите длину: ", '-');
        this.width = askUserInput(checker, "Введите ширину: ", '-');
        this.height = askUserInput(checker, "Введите высоту: ", '-');
    }
}

