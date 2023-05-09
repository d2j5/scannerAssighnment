import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String stringInput = scanner.nextLine();

        System.out.println("Enter an integer: ");
        int intInput = scanner.nextInt();
        //scanner.nextLine(); // consume the leftover newline character

        System.out.println("Enter an double: ");
        double doubletInput = scanner.nextDouble();
        //scanner.nextLine(); // consume the leftover newline character

        System.out.print("Enter a boolean value: ");
        boolean booleanInput = scanner.nextBoolean();

        System.out.println("Your string is " + stringInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubletInput);
        System.out.println("Your boolean is " + booleanInput);

    }
}
