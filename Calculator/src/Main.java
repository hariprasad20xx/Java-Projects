import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
        System.out.print("Select the operation: ");
        int operationCode = scanner.nextInt();
        System.out.print("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = 0;

        switch (operationCode) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Can't divide by zero!");
                    return;
                } else {
                    result = number1 / number2;
                }
                break;
            default:
                System.out.println("Please enter a valid operation code.");
        }

        System.out.println("Result = " + result);

        scanner.close();
    }
}
