package Task22.shapes;

import Task22.shapes.exceptions.NegativeValueException;

public class InputChecker {

    public void checkInput(String number) throws NumberFormatException, NegativeValueException {
        checkIfNumber(number);
        checkIfPositiveNumber(number);
    }

    private void checkIfNumber(String number) throws NumberFormatException {
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("введено не число");
        }
    }

    private void checkIfPositiveNumber(String number) throws NumberFormatException, NegativeValueException {
        checkIfNumber(number);
        if(Double.parseDouble(number) < 0){
            throw new NegativeValueException("введено число меньшe ноля");
        }
    }


}
