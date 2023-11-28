package Task22.shapes;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner = new Scanner(System.in);
    public String getInput(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
    public void closeInputReader(){
        scanner.close();
    }
}
