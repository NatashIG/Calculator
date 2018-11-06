import java.util.Scanner;

public class Calculator {
    private int result = 0;
    private int input;

    public void start() {
        String operation;

        do {
            showMenu();

            operation = inputOperation("Please input operation: ");

            if (operation.equals("+")) {
                input = inputData("Please input number: ");
                result = result + input;

            } else if (operation.equals("-")) {
                input = inputData("Please input number: ");
                result = result - input;

            } else if (operation.equals("*")) {
                input = inputData("Please input number: ");
                result = result * input;

            } else if (operation.equals("/")) {
                input = inputData("Please input number: ");
                if (input != 0) {
                    result = result / input;
                } else {
                    System.out.println("Invalid operation");
                }
            }
        }
        while (!operation.equalsIgnoreCase("Q"));
    }

    public void showMenu() {
        System.out.println("+ Add");
        System.out.println("- Deduct");
        System.out.println("* Multiply");
        System.out.println("/ Deduct");
        System.out.println("Q Quit");
        System.out.println("Your current value is: " + result);
    }

    public String inputOperation(String message) {
        System.out.print(message);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int inputData(String message) {
        System.out.print(message);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}


