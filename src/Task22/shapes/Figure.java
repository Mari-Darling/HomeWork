package Task22.shapes;

import Task22.shapes.exceptions.NegativeValueException;


public abstract class Figure implements Shape {
    public Figure( ) {
        input();
    }

    protected abstract void input( );

    protected double askUserInput(InputChecker checker, String message, char fillCharacter) {
        String inp = new InputReader().getInput(message);
        try {
            checker.checkInput(inp);
        } catch (NegativeValueException | NumberFormatException e) {
            e.printStackTrace();
            System.out.println("StackTrace message: ");
            drawLine('-', 50, true);
            return askUserInput(checker, message, fillCharacter);
        }
        return Double.parseDouble(inp);
    }


    private void drawLine(char fillCharacter, int times, boolean tabulation) {
        if (tabulation) {
            System.out.print("\n\t\t");
        }
        for (int i = 0; i < times; i++) {
            System.out.print(fillCharacter);
        }
        System.out.println("\n");
    }
}
